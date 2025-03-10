import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.agp.application) apply false
    alias(libs.plugins.agp.library) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.androidx.navigation.safeargs) apply false
}

allprojects {
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions { jvmTarget = gradleProjectConfig.versions.kotlin.options.jvm.get() }
    }
}