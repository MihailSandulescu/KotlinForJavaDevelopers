package Challenge1

//Challenge 1

fun main() {

    val text: Any = "The Any type is the root of the Kotlin class hierarchy"

    if(text is String) {
        println(text.toUpperCase())
    }

    println("""1   1
             1  11
            1 111
           11111""".trimMargin("1"))

    val names = arrayOf("String", 1, "float", 2L, 6.9f)

    val firstSixEvens = Array(6) { i -> i * 2}

    firstSixEvens.forEach { elem -> print(" ${elem} ") }
}