object Sdk {
    const val min = 21
    const val target = 30
    const val compile = 30
}

object Version {
    const val java = "11"
    const val kotlin = "1.4.32"

    // Libs

    const val dokka = "1.4.20"
    const val ktlint = "0.40.0"

    // Test libs

    const val testEspresso = "3.3.0"
    const val testJunit = "4.13.2"

    // Gradle plugins

    const val pluginDetekt = "1.16.0"
    const val pluginKtlint = "10.0.0"
    const val pluginBenManesVersions = "0.38.0"
}


object Lib {
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Version.kotlin}"

    // tests
    const val testJunit = "junit:junit:${Version.testJunit}"
    const val testAndroidxEspresso = "androidx.test.espresso:espresso-core:${Version.testEspresso}"
}

