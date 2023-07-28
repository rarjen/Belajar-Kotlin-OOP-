package app

import data.SmartPhone

fun main() {
    /*
    Any Class
    - Di Kotlin, semua class yang kita buat tanpa class Parent, sebenarnya secara otomatis dia akan menjadi class child dari class Any
    - Any adalah superclass untuk semua class yang kita buat di Kotlin
    - Apapun yang kita akses class nya (sebagai parent) sebenarnya dia adalah extends any
     */

    val smartPhone = SmartPhone("Samsung S10", "Android");
    println(smartPhone.toString()); // toString merupakan function turuna dari any
    println(smartPhone.hashCode()); // hashCode merupakan function turuna dari any
}