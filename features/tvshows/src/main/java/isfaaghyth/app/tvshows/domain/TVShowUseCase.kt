package isfaaghyth.app.tvshows.domain

import isfaaghyth.app.data.BuildConfig
import isfaaghyth.app.data.TVShows
import isfaaghyth.app.tvshows.data.repository.TVShowRepository
import isfaaghyth.app.tvshows.ui.TVShowState
import java.io.IOException
import java.lang.Exception
import javax.inject.Inject

class TVShowUseCase @Inject constructor(private val repository: TVShowRepository) {

    suspend fun getPopularTvShow(apiKey: String = API_KEY): TVShowState {
        val response = repository.getPopularTVShow(apiKey).await()

        return try {
            if (response.isSuccessful) {
                response.body()?.let {
                    TVShowState.LoadSuccess(it)
                }?: TVShowState.MovieError(IOException("Result Not Found"))
            } else {
                TVShowState.MovieError(IOException("Error occurred during fetching movies!"))
            }
        } catch (e: Exception) {
            TVShowState.MovieError(IOException("Unable to fetch movies!"))
        }
    }

    companion object {
        const val API_KEY = BuildConfig.API_KEY
    }

}