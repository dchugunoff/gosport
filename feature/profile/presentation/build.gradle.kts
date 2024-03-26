plugins {
    id(libs.plugins.agp.library.get().pluginId)
    id(libs.plugins.kotlin.android.get().pluginId)
    id(libs.plugins.kotlin.parcelize.get().pluginId)
    id(libs.plugins.androidx.navigation.safeargs.get().pluginId)
    id(libs.plugins.kotlinx.serialization.get().pluginId)
}

android {
    namespace = androidProjectConfig.versions.namespaces.feature.profile.presentation.get()
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
        dataBinding = true
    }

    sourceSets.getByName("main") {
        res.srcDirs(androidProjectConfig.versions.sourcesets.core.presentation.get())
    }
}

dependencies {
    implementation(projects.core.presentation)
    implementation(projects.feature.profile.data)
    implementation(projects.feature.profile.domain)
}