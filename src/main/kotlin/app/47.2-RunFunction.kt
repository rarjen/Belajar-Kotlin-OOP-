package app

import data.Student

fun main() {
    /*
    Run Function
    - Run Function mirip dengan let function
    - Yang membedakan adl, pada run function, tdk ada param pada lambda nya, sehingga kita tidak bisa mengakses reference object
      menggunakan kata kunci it. namun kita masih bisa menggunakan kata kunci this
     */

    val student = Student("Kevin", 22);
    val result: String = student.run {
        "Name ${this.name}, Age ${this.age}";
    }

    println(result);
}