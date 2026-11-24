plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }
android {
 namespace = "com.envarg.stockmanager"
 compileSdk = 35
 defaultConfig { applicationId = "com.envarg.stockpro"; minSdk = 24; targetSdk = 28; versionCode = 1; versionName = "11.0" }
 compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
 kotlinOptions { jvmTarget = "17" }
}
