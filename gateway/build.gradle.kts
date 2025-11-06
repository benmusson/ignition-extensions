plugins {
    `java-library`
    kotlin("jvm")
    alias(libs.plugins.spotless)
}

kotlin {
    jvmToolchain(libs.versions.java.map(String::toInt).get())
}

dependencies {
    compileOnly(libs.bundles.gateway)
    compileOnly(projects.common)
}

spotless { kotlin { ktfmt().kotlinlangStyle() } }
