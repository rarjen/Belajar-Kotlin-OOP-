package app

import data.Student

fun main() {
    /*
    Apply Function
    - Apply function hampir sama dengan run function
    - Yang membedakan adl return value dai apply function adl reference object itu sendiri
     */

    val student = Student("Student", 22);
    val result: Student = student.apply {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result); // return object nya sendiri

}