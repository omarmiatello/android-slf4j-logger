fun String.isStableVersion(): Boolean {
    val upperCase = toUpperCase(java.util.Locale.ROOT)
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { it in upperCase }
    return stableKeyword || Regex("^[0-9,.v-]+(-r)?$").matches(this)
}

fun String.isNotStableVersion() = !isStableVersion()

object Sdk {
    const val min = 21
    const val target = 30
    const val compile = 30
}

object Version {
    const val java = "11"
    const val kotlin = "1.4.32"
}

object Lib {
    const val logbackClassic = "ch.qos.logback:logback-classic:1.2.3"
}
