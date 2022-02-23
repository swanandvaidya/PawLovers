object Versions {

    const val min_sdk = 21
    const val target_sdk = 31

    const val activity = "1.4.0"
    const val ktx_core = "1.7.0"
    const val appcompat = "1.4.1"
    const val material = "1.5.0"
    const val constraint_layout = "2.1.3"
    const val splash_screen = "1.0.0-beta01"

    const val lifecycle = "2.4.1"
    const val coroutine = "1.3.9"

    const val junit = "4.13.2"
    const val ext_junit = "1.1.3"
    const val espresso_core = "3.4.0"
}

object Libs {
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"
    const val lifecycle= "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
}

object SupportLibs {

    const val activityCompose = "androidx.activity:activity-compose:${Versions.activity}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.ktx_core}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    const val splashScreen = "androidx.core:core-splashscreen:${Versions.splash_screen}"
}

object TestingLibs {

    const val junit = "junit:junit:${Versions.junit}"
    const val extJunit = "androidx.test.ext:junit:${Versions.ext_junit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
}