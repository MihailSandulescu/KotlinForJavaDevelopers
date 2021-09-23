package challenge7

fun main() {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val people = mapOf(
        "Jones" to joe,
        "Smith" to jane,
        "Wilson" to mary,
        "Adams" to john,
        "Smithson" to jean
    )

    println("${ people.filter { it.value.lastName.startsWith("S", true) }
        .count() }")

    val fullName = people.map { Pair(it.value.firstName, it.value.lastName) }
    //OR
//    val firstNames = people.map { it.value.firstName }
//    val lastNames = people.map { it.value.lastName }
//    val fullName2 = firstNames.zip(lastNames)

    people.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old") }
    }

    val (fname, lname, age) = joe
    println("fname = $fname, lname = $lname, age = $age")

    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)
    val resultList = list1.filter { it in list2 }
    val alternateResultList = list1.filter { list2.contains(it) }
    println(resultList)
    println(alternateResultList)

    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper

}

//data class Person(val firstName: String, val lastName: String, val age: Int) {
//}

// OR

class Person(val firstName: String, val lastName: String, val age: Int) {
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age
}

class Box<out T> {
    //fun takePaper(): T {} - OK to use T as return type
    //fun addPaper(paper: T) - NOT OK to use T as type parameter, because T is OUT
}
open class Paper {}
class Regular: Paper() {}
class Premium: Paper() {}