plugins {
    id(libs.plugins.java.library.get().pluginId)
    id(libs.plugins.kotlin.jvm.get().pluginId)
    id(libs.plugins.kotlinx.serialization.get().pluginId)
}

java {
    sourceCompatibility = JavaVersion.VERSION_19
    targetCompatibility = JavaVersion.VERSION_19
}
dependencies {
    api(libs.bundles.kotlinx.core)
    api(libs.koin.core)
}