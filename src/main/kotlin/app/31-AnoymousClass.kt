package app

import data.Action

// function turunan dari interface
fun fireAction(action: Action) {
    // melakukan akses fun action pada interface Action
    action.action();
    action.run();
}

// saat ingin memanggil fireAction harus buat class nya dlu
class SampleAction : Action {
    override fun action() {
        println("This is sample action")
    }

    override fun run() {
        println("Running for your lyfe")
    }
}

fun main() {
    /*
    Anonymous Class
    - Saat kita ingin membuat object, maka kita diwajibkan untuk menggunakan deklarasi class yang  lengkap
    - Namun, Kotlin mendukung pembuatan object dari class yang bahkan belum lengkap
    - Bahkan, di Kotlin, kisa bisa membuat object dari interface
    - Kemampuan ini dinamakan anonymous class
    - Untuk membuat anonymous class, kita bisa menggunakan kata kunci object diikuti dengan deklarasi class Child seperti pada pewarisan
     */

    fireAction(SampleAction());

    // Kita bisa melakukan akses fireAction tanpa membuat class terlebih dahulu menggunakan Anonymous class
    // Class tanpa nama
    fireAction(object : Action {
        override fun action() {
            println("Action One");
        }
        override fun run() {
            println("Run 1");
        }
    })

    fireAction(object : Action {
        override fun action() = println("Action Two");
        override fun run() {
            println("Run 2")
        }
    })
}