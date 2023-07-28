package app

import data.Company

fun main() {
   /*
   Equals Function
   - Di Kotlin, semua objek bisa dibandingkan menggunakan operasi == atau !=
   - Saat kita membandingkan objek menggunakan operasi == atau !=, sebenarnya Kotlin akan menggunakan function equals milik class Any
   - Untuk mengubah cara membandingkannya, kita bisa meng-override function equals milik class Any
    */

    val company1 = Company("Leinto Corp");
    val company2 = Company("Leinto Corp");

    println(company1 == company2) //false => krn 2 object yang berbeda walaupun string nya sama
    println(company1 == company1) //true

    println(company1 == company2) //true
    println(company1 == company1) //true


}