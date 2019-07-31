/**
 * Created by isfaaghyth on 31/07/19.
 * github: @isfaaghyth
 */

object ApplicationId {
    val id = "isfaaghyth.app.jetmovie"
}

object Releases {
    val versionCode = 1
    val versionName = "1.0"

    val buildToolsVersion = "29.0.0"
    val compileSdkVersion = 28
    val targetSdkVersion = 28
    val minSdkVersion = 17
}

object Version {
    //common
    const val kotlin            = "1.3.20"
    const val gradle            = "3.3.1"

    //androidx
    const val constraintLayout  = "1.1.2"
    const val appCompat         = "1.0.0-beta01"
    const val ktx               = "1.2.0-alpha02"

    //network
    const val retrofit          = "2.5.0"
    const val rxretrofit        = "2.4.0"
    const val okhttpLogging     = "3.11.0"

    //thread
    const val coroutines        = "1.3.0-M2"
    const val coroutinesAdapter = "0.9.2"

    //media
    const val glide             = "4.8.0"

    //di
    const val dagger            = "2.21"

    //testing
    const val jUnit             = "4.12"
    const val testRunner        = "1.1.0-alpha4"
    const val espresso          = "3.1.0-alpha4"
    const val mockito           = "2.8.47"
    const val mockKotlin        = "2.1.0"
    const val mockTestRunner    = "0.3.1"
}

object Android {
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
    val ktx = "androidx.core:core-ktx:${Version.ktx}"
}

object Dependencies {
    val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
    val gradle = "com.android.tools.build:gradle:${Version.gradle}"
}

object Retrofit {
    val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    val gsonConverter = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"
    val scalarConverter = "com.squareup.retrofit2:converter-scalars:${Version.retrofit}"
    val rxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Version.rxretrofit}"
    val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Version.okhttpLogging}"
    val coroutinesAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Version.coroutinesAdapter}"
}

object Coroutines {
    val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}"
    val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}"
}

object Glide {
    val glide = "com.github.bumptech.glide:glide:${Version.glide}"
    val compiler = "com.github.bumptech.glide:compiler:${Version.glide}"
}

object Dagger {
    val dagger = "com.google.dagger:dagger:${Version.dagger}"
    val android = "com.google.dagger:dagger-android:${Version.dagger}"
    val androidSupport = "com.google.dagger:dagger-android-support:${Version.dagger}"
    val compiler = "com.google.dagger:dagger-compiler:${Version.dagger}"
    val processor = "com.google.dagger:dagger-android-processor:${Version.dagger}"
}

object Testing {
    val jUnit = "junit:junit:${Version.jUnit}"
    val testRunner = "androidx.test:runner:${Version.testRunner}"
    val espresso = "androidx.test.espresso:espresso-core:${Version.espresso}"
    val mockito = "org.mockito:mockito-inline:${Version.mockito}"
    val mockKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Version.mockKotlin}"
    val mockKtRunner = "de.jodamob.kotlin:kotlin-runner-junit4:${Version.mockTestRunner}"
}