package app

import data.Manager
import data.VicePresident

fun main() {
    /*
    Inheritence
    - Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
    - Dalam artian, kita bisa membuat class Parent dan class Child
    - Di Kotlin, tiap class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak class Child
    - Secara standar, di class yang dibuat di Kotlin adalah final (tidak bisa diwariskan), agar bisa diwariskan, kita harus
      menggunakan kata kunci open
     */

    val manager1 = Manager("Kevin");
    manager1.sayHello("Boss");

    val vicepresident1 = VicePresident("Leinto");
    vicepresident1.sayHello("CEO")
}