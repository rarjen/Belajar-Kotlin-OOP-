package app

import data.Student

fun main() {
    /*
    Also Function
    - Also function mirip engan let function
    - Yang membedakan adl, pada also function, return value nya adalah reference ke object itu sendiri
     */

    val student = Student("Otniel", 22);

    val result: Student = student.also {
        "Name ${it.name}, age ${it.age}"
    }
    println(result)
}