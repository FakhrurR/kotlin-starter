fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    println("First letter is $firstChar and $lastChar for second later")

}

// TODO 1
fun String.getFirstAndLast() = mapOf<String, Char>(
        "first" to 'K',
        "last" to 'n'
)