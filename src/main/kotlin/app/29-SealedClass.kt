package app

import data.Minus
import data.Modulo
import data.Operation
import data.Plus

fun main() {
    /*
    Sealed Class
    - Sealed class merupakan jenis class yang didesain untuk inheritance
    - Sealed class tidak bisa diinstansiasi menjadi object, dan secara standar sealed class merupakan abstract class
    - Sealed class sangat cocok digunakan sebagai class Parent

    Sealed Class di When Expression
    - Sealed class sangat berguna saat kita menggunakan when expression
    - Dengan menggunakan sealed class, kita bisa membatasi hanya class turunannya yang perlu di check
     */

    val plus = Plus();
    println(plus.name);

    val minus = Minus();
    println(minus.name);

    // Sealed class
    fun operation(value1: Int, value2: Int, operation: Operation): Int {
        return when(operation) {
            is Plus -> value1 + value2;
            is Minus -> value1 - value2;
            is Modulo -> value1 % value2;
        }
    }

    println(operation(10, 10, Plus())); //20
    println(operation(10, 5, Minus())); //5
    println(operation(10, 3, Modulo())); //1
}