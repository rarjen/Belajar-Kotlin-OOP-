package app

import data.MinMax

fun minMax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value2);
        else -> MinMax(value1, value2);
    }
}

fun main() {
    /*
    Destructuring di Function
    - Destructuring declarations juga bisa dilakukan ketika memanggil function
    - Dengan ini, seakan-akan kita bisa mengembalikan multiple return value pada function
     */

//    val result = minMax(10, 100);
//    val min = result.min;
//    val max = result.max;
//    println(min);
//    println(max);

    // Cara akses yang benar
//    val (min, max) = minMax(10, 100);
//    println(max)
//    println(min)

    /*
    Underscore untuk variable tidak digunakan
    - Kadang kita ingin melakukan destructuring pada beberapa variable
     */

    val (min, _) = minMax(10, 100);
    println(min); //10


}