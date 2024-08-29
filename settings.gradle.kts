pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "WhatsPackt"
include(":app")
include(":common:domain")
include(":common:data")
include(":common:framework")
include(":feature:create_chat")
include(":feature:conversations")
include(":feature:chat")
