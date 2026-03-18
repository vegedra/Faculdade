plugins {
    id("java")
    id("application")
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "com.github.vegedra"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

javafx {
    version = "17"
    modules = listOf("javafx.controls", "javafx.fxml")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application {
    mainClass.set("com.github.vegedra.tutorial.Main")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}