package challenge2


fun main() {
//1
    val float1: Float? = -3487.384f
    val float2 = -3487.84f

//2
    val float3: Float? = -3487.384f
    val float4: Float? = -3487.84f

//3
    val shortArray= shortArrayOf(1,2,3,4,5)
    val arrayOfShort: Array<Short?> = arrayOf(1,2,3,4,5)

//4
    val arrayOfInts = Array<Int?>(40) { elem -> (elem+1) * 5}

//5
    val charArray = charArrayOf('a','b','c')

//6
    val x: String? = "I AM IN UPPERCASE"
    val newString = x?.toLowerCase() ?: "I give up!"

//7
    newString.let{println(it.toLowerCase().replace("am","am not"))}
    println(newString)

//8
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()
}

