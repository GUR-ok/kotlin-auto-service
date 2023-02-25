plugins {
    kotlin("jvm")
    id("org.springframework.boot") version "2.7.7"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
    kotlin("plugin.spring") version "1.6.21"
}

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test-junit"))
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}