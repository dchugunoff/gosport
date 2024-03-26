plugins {
    id(libs.plugins.agp.application.get().pluginId)
    id(libs.plugins.kotlin.android.get().pluginId)
}

android {
    androidProjectConfig.versions.apply {
        namespace = namespaces.app.get()
        compileSdk = sdk.compile.get().toInt()

        defaultConfig {
            applicationId = namespaces.app.get()
            minSdk = sdk.min.get().toInt()
            targetSdk = sdk.target.get().toInt()
            "${versioning.major.get()}.${versioning.feature.get()}.${versioning.patch.get()}".also { version ->
                versionCode =
                    version.replace(".", "").toInt()
                versionName =
                    version
            }
        }
    }

    buildTypes {
        release {
            isDebuggable = false
            isShrinkResources = true
            isMinifyEnabled = true
        }

        debug {
            isDebuggable = true
            isShrinkResources = false
            isMinifyEnabled = false
        }
    }

    applicationVariants.all {
        outputs.all {
            (this as? com.android.build.gradle.internal.api.BaseVariantOutputImpl)?.outputFileName =
                "GoSport.apk"
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
    implementation(libs.bundles.androidx.ui)
    implementation(libs.bundles.kotlinx.android)
    implementation(libs.bundles.koin.android)
}