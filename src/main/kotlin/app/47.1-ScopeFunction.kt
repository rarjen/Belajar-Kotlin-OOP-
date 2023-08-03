package app

import data.Student

fun main() {
    /*
    Scope Function
    - Kotlin memiliki stadnar library yg berisikan beberapa fun yg bisa digunakan utk mengeksekusi object dgn mudah memanfaatkan \
      lambda expression
    - Function-function tsb adlh let, run, with, apply, dan also
     */

    /*
    Let Function
    - Let function bisa digunakan sebagai reference block agar kita bisa lebih mudah ketika ingin memanipulasi sebuah object
    - Let function memiliki paramater object itu sendiri, sehingga kita bisa menggunakan kata kunci it utk mendapatkan referensi
      mendapatkan referensi thd object tsb
    - Cocok untuk kasus kita ingin memanipulasi object itu sendri lalu tidak perlu mengetikan nama object nya berkali-kali
     */

    val student = Student("Otniel", 22);
    // biasanya kita menggunakan ini
    println(student.name);
    println(student.age);

    // dengan Let Function
    // Block lambda
    student.let {
        println(it.name);
        println(it.age);
    }

    //bisa juga seperti ini
    val result = student.let {
        println(it.name);
        println(it.age);
        "Kevin"
    }
    println(result)

    // bisa seperti ini juga
    val result2: String = student.let {
        "Name ${it.name}, Age ${it.age}";
    }
    println(result2)

}