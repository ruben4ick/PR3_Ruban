plugins {
    id("java")
}

group = "com.calculator"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

// ./gradlew checkFileExists -PfileName="\build.gradle.kts"
// ./gradlew checkFileExists -PfileName="\Main.java"
tasks.register("checkFileExists") {

    val filePath = project.findProperty("fileName").toString()
    val file = file(filePath)

    if (file.exists()) {
        println("File exists: ${file.absolutePath}")
    } else {
        println("File does not exist: ${file.absolutePath}")
    }
}

tasks.register<Zip>("packageProject") {
    description = "Packages the project into a ZIP file."
    from(".") {
        include("**/*")
        exclude("build/**", ".gradle/**", ".idea/**", "out/**", "*.iml", "**/.git/**")
    }
    archiveFileName.set("${project.name}-${project.version}.zip")
    destinationDirectory.set(file("${buildDir}/packages"))
    doNotTrackState("Potential issues with file system access")
}


