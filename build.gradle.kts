// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()       // Repositório do Google (necessário para Android)
        mavenCentral() // Repositório Maven Central (necessário para o Kotlin e plugins do Compose)
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.7.2") // Versão do Android Gradle Plugin
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.0") // Versão do Kotlin
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
