plugins {
    val kotlinVersion: String by System.getProperties()
    val versionsVersion: String by System.getProperties()

    kotlin("jvm") version "1.9.0"
    application
    id("com.github.ben-manes.versions") version "0.47.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
}

// Versions
val kotestVersion: String by project

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}