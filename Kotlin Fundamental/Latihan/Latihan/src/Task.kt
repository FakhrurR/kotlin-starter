fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val resultA = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)

    println("""
         resultA is $resultA
         resultB is $resultB
    """.trimIndent())

}

fun calculate(valueA: Int, valueB: Int, valueC: Int? = null): String {
    // TODO 1

    val valueCC = valueC ?: 100

    val result = valueA + (valueB - valueCC)

    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int) = "$result"