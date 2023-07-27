package app

import data.Circle
import data.Rectangle
import data.Shape

fun main() {
    /*
    Properties Overriding
    - Selain membuat ulang function di class Child, di Kotlin juga kita bisa membuat ulang properties
    - Secara standar, properties di class bersifat final, tidak bisa di buat ulang di class Child nya,
      agar bisa dibuat ulang, kita harus menggunakan kata kunci open
     */
    val shape = Shape();
    println(shape.corner); //-1

    val rectangle = Rectangle();
    println(rectangle.corner); //4

    val circle = Circle();
    println(circle.corner); //0
}