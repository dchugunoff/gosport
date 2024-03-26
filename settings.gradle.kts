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
include(
    ":core:data",
    ":core:domain",
    ":core:presentation"
)
include(
    ":feature:cart:data",
    ":feature:cart:domain",
    ":feature:cart:presentation"
)
include(
    ":feature:menu:data",
    ":feature:menu:domain",
    ":feature:menu:presentation"
)
include(
    ":feature:profile:data",
    ":feature:profile:domain",
    ":feature:profile:presentation"
)
