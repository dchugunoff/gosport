plugins {
    id(libs.plugins.agp.library.get().pluginId)
    id(libs.plugins.kotlin.android.get().pluginId)
}

android {
    namespace = androidProjectConfig.versions.namespaces.core.presentation.get()
    compileSdk = androidProjectConfig.versions.sdk.compile.get().toInt()

    defaultConfig {
        minSdk = androidProjectConfig.versions.sdk.min.get().toInt()
    }

    buildTypes {
        release {
            isMinifyEnabled = true
        }

        debug {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }

    buildFeatures {
        viewBinding = true
    }
}
dependencies {
    api(projects.core.data)
    api(projects.core.domain)
    api(libs.bundles.androidx.ui)
    api(libs.bundles.kotlinx.android)
    api(libs.bundles.koin.android)
}