plugins {
    id("com.android.application") version "7.1.3" apply false
    id("com.android.library") version "7.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.6.10" apply false
}

tasks.register<Delete>("clean").configure {
    delete(rootProject.buildDir)
}
