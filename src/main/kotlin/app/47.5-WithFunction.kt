package app

import data.Student

fun main() {
    /*
    With: Function
    - With Function mirip dengan run fun, menggunakan reference this
    - yang membedakan adl, with fun bukanlah extension fun, jadi tidak bisa digunakan langsung dari object nya
    - Kita harus memanggil with fun secara manual
     */

    val student = Student("Otniel", 22);

    // Lambda
   with(student) {
        println(this.name);
        println(this.age);
    }

    val result: String = with(student) {
        "Name ${this.name}, age ${this.age}"
    }
    println(result)

    /*
    Digunakan untuk memberitahu bahwa kita akan melakukan operasi pada sebuah object dan di kumpulkan dalam 1 block
     */
}