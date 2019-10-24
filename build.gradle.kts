plugins {
    application
    id("com.techshroom.incise-blue") version "0.4.0"
    kotlin("jvm") version "1.3.50"
}

inciseBlue {
    ide()
    license()
    util {
        javaVersion = JavaVersion.VERSION_1_8
    }
}

dependencies {
    "implementation"(kotlin("stdlib-jdk8"))
}

application.mainClassName = "net.octyl.zcs.MainKt"
