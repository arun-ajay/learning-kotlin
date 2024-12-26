plugins {
  kotlin("jvm") version "2.0.21"
  id("com.ncorti.ktfmt.gradle") version "0.53"
}

ktfmt { googleStyle() }

group = "org.example"

version = "1.0-SNAPSHOT"

repositories { mavenCentral() }

dependencies { testImplementation(kotlin("test")) }

tasks.test { useJUnitPlatform() }
