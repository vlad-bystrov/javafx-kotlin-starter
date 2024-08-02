plugins {
    alias(libs.plugins.jvm)
    alias(libs.plugins.javafx)
    alias(libs.plugins.javamodularity)
    application
}

repositories {
    mavenCentral()
}

dependencies {
}

java {
    modularity.inferModulePath.set(false)

    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

javafx {
    version = "22.0.1"
    modules("javafx.controls", "javafx.fxml")
}

application {
    mainClass = "org.example.AppKt"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
