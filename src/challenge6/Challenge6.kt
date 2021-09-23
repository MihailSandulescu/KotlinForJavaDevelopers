package challenge6

fun main() {

    //1
    for(i in 5..5000 step 5) print("$i ")
    println()

    //2
    for(i in -500..0) print("$i ")
    println()

    //3
    var first = 0
    var second = 1
    print("$first, $second")
    for(i in 1..13) {
        val next = first + second
        first = second
        second = next
        print(", $next")
    }
    println()

    //4
    loop1@ for(i in 1..5) {
        print("$i ")
        if(i == 2) break
        loop2@ for(j in 11..20) {
            print("$j ")
            loop3@ for(k in 100 downTo 90) {
                print("$k ")
                if(k == 98) continue@loop1
            }
        }
    }
    println()

    //5
    val num : Int = 400
    val dnum = when {
        num > 100 -> -233.567
        num < 100 -> 4444.555
        else -> 0.0
    }
    println("$dnum")
}