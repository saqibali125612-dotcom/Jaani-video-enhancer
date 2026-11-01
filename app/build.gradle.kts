plugins {
id("com.android.application")
id("org.jetbrains.kotlin.android")
}

android {
namespace = "com.jaani.videoenhancer"
compileSdk = 35

defaultConfig {
    applicationId = "com.jaani.videoenhancer"
    minSdk = 29
    targetSdk = 35
    versionCode = 1
    versionName = "1.0"
}

compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlinOptions {
    jvmTarget = "17"
}

}

dependencies {
implementation("androidx.appcompat:appcompat:1.7.0")
implementation("com.google.android.material:material:1.12.0")
implementation("androidx.media3:media3-common:1.11.1")
implementation("androidx.media3:media3-transformer:1.11.1")
}
