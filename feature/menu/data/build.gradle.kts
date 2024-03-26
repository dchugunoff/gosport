plugins {
    id(libs.plugins.agp.library.get().pluginId)
    id(libs.plugins.kotlin.android.get().pluginId)
    id(libs.plugins.kotlinx.serialization.get().pluginId)
}

android {
    namespace = androidProjectConfig.versions.namespaces.feature.menu.data.get()
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
}

dependencies {
    implementation(projects.core.data)
    implementation(projects.feature.menu.domain)
}