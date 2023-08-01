package app

import data.Application
import data.OperationTest

fun main() {
    /*
    Companion Object
    - Companion object adalah kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object
    - Companion object secara otomatis akan menggunakan nama Companion, atau bisa langsung diakses lewat nama class nya
     */

    // 2 cara Akses Object
    Application.hello("Kevin"); // keuntungannya adl dapat mengakses object tanpa menyebutkan namanya
    Application.Companion.hello("Kevin");


    // Coba sendiri
//    println(OperationTest.Operation.sum(10, 10)); // Jika nama object companion diberikan
    println(OperationTest.Companion.sum(10, 10)); //20
    println(OperationTest.subs(50, 10)); //40

}