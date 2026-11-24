plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }
android {
 namespace = "com.envarg.stockmanager"
 compileSdk = 35
 defaultConfig { applicationId = "com.envarg.inventory.pro2026"; minSdk = 24; targetSdk = 28; versionCode = 12; versionName = "12.0" }
 compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
 kotlinOptions { jvmTarget = "17" }
}
