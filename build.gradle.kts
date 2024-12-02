plugins {
    kotlin("jvm") version "1.9.24"
}
dependencies {
    implementation("org.testng:testng:7.7.0")
}

sourceSets {
    main {
        kotlin.srcDir("src")
    }
}

tasks {
    wrapper {
        gradleVersion = "8.11.1"
    }
}
