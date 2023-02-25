rootProject.name = "kotlin-product-store"

//https://docs.gradle.org/current/userguide/plugins.html#sec:plugin_version_management
pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        //https://docs.gradle.org/current/userguide/plugins.html#sec:subprojects_plugins_dsl
        kotlin("jvm") version kotlinVersion apply false
    }
}

include ("m1l1-quickstart")
include ("hw02-doc")