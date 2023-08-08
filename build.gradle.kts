plugins {
    val kotlinVersion: String by System.getProperties()
    val versionsVersion: String by System.getProperties()

    kotlin("jvm") version kotlinVersion
    application
    id("com.github.ben-manes.versions") version versionsVersion
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