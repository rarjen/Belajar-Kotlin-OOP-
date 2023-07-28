package app

import data.Human

fun main() {
    /*
    Interface
    - Di kotlin, deklarasi type tidak hanya dalam bentuk class, ada juga interface
    - Interface adalah blueprint, prototype atau cetakan di Kotlin
    - Berbeda dengan Class, Interface tidak bisa langsung dibuat sebagai Object
    - Interface hanya bisa diturunkan, dan biasanya Interface digunakan sebagai kontrak untuk class - class turunannya
    - Secara standar, semua properties dan function di Interface adalah abstract
     */

    val human = Human("Kevin");
    human.sayHello("Otniel");
}