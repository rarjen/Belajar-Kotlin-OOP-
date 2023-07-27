package app

import data.RectangleSuperProperties
import data.TriangleSuperFunction

fun main() {
    /*
    Super Keyword
    - Kadang kita ingin mengakses function atau properties milik class Parent yang sudah dibuat ulang oleh class Child
    - Untuk mengakses function  atau properties milik class Parent, kita bisa menggunakan kata kunci super
     */

    val rectangle = RectangleSuperProperties();
    println(rectangle.corner); //4
    println(rectangle.parentCorner); //-1


    val triangle = TriangleSuperFunction();
    triangle.printName();

}