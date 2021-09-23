fun main() {
    val range = 1..5
    val stringRange = "ABD".."XYZ"
    val backwardRange = 5.downTo(1)

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val reversedRange = stepRange.reversed()

    for (i in range) {
        print("$i ")
    }
    reversedRange.forEach { elem -> print("$elem ") }

    for(num in 1..20 step 4) {
        print("$num ")
    }

    for(i in 20 downTo -15 step 5) {
        print("$i ")
    }

    for(i in 1 until 10) {
        print("$i ")
    }

    val seasons = arrayOf("spring","summer","winter","fall")
    for(season in seasons) {
        println(season)
    }
    val notASeason = "whatever" !in seasons
    println(notASeason)

    seasons.forEach { println(it) }
    seasons.forEachIndexed {index, value -> println("$value is season number $index")}
    
}