package app

import data.Utilities

fun main() {
    /*
    Singleton Object
    - Salah satu konsep Design Pattern yang sangat populer adalah singleton object
    - Singleton object adalah object yang hanya dibuat satu kali
    - Di Kotlin, membuat object singleton sangat mudah, hanya dengan menggunakan kata kunci object
    - Cara membuat singleton object di Kotlin sama seperti membuat class
    - Singleton object mirip dengan class, bisa extends class ataupun interface
    - Namun singleton object tidak memiliki constructors
    - Biasanya digunakan untuk buat helper class atau utility class
     */

    val utilities = Utilities.name;
    println(utilities);

    val function = Utilities.toUpper("otniel");
    println(function);

}