package challenge9.kotlincode

import challenge9.javacode.Employee

fun main() {
    val employee = Employee("Jane", "Smith", 2000)

    employee.lastName = "Jones"
    employee.salaryLast3Years = floatArrayOf(50000.25f, 54000.60f, 56800.42f)
  //employee.salaryLast3Years = arrayOf(50000.25f, 54000.60f, 56800.42f).toFloatArray()
}