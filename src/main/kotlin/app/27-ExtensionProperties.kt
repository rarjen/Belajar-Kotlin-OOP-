package app

import data.Student
import data.upperName

fun main() {
    /*
    Extension Properties
    - Selain function, kita juga bisa membuat extension untuk properties di Kotlin
    - Untuk membuat extension properties, kita bisa membuat properties dengan Getter atau Setter
     */

    val student = Student("Kevin", 21);
    println(student?.upperName); // karena nullable maka menggunakan tanda tanya

}