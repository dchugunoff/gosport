pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("androidProjectConfig") {
            from(files("gradle/android-project-config.versions.toml"))
        }

        create("gradleProjectConfig") {
            from(files("gradle/gradle-project-config.versions.toml"))
        }
    }
}

rootProject.name = "GoSportTechnicalTask"
include(":app")
 