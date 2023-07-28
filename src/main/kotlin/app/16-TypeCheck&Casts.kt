package app

import data.HandPhone
import data.Laptop

// Kode: Print Function
//fun printObject(any: Any) {
//    println(any);
//}

// Cast If Expression
fun printObjectIs(any: Any) {
    if(any is Laptop) {
        println("Laptop ${any.name}") // ini adlh cast
    } else if (any is HandPhone) {
        println("Handphone ${any.name}")
    } else {
        println(any)
    }
}

// Cast When Expression
fun printObjectWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop ${any.name}");
        is HandPhone -> println("handphone ${any.name}");
        else -> println(any);
    }
}

// Unsafe Casts
//fun printString(any: Any) {
//    val value = any as String; // unsafe
//    println(value);
//}

// Safe Nullable Casts
fun printStringSafe(any: Any) {
    val value: String? = any as? String;
    println(value);
}

fun main() {
    /*
    Type Check & Cast
    - Dalam Object Oriented Programming, kita akan bertemu dengan banyak sekali tipe data (class) dan pewarisan (inheritance)
    - Kadang kita butuh melakukan pengecekan tipe data, atau bahkan melakukan konversi data
     */

//    printObject("Otniel");
//    printObject(1);
//    printObject(Laptop("HP"));
//    printObject(HandPhone("Samsung"));


    /*
    is dan !is Operator
    - is digunakan utk melakukan pengecekan apakah sebuah data merupakan tipe data tertentu.
    - !is digunakan utk melakukan pengecekan apakah sebuah data bukan merupakan tipe data tertentu

    Smart Cast ( If Expression )
    - Kotlin memiliki mekanisme konversi data secara otomatis setelah kita melakukan pengecekan menggunakan is
    - Setelah kita melakukan pengecekan menggunakan is, maka secara otomatis tipe data yang kita cek akan berubah menjadi
      tipe data yang kita check
     */


//    printObjectIs("Otniel");
//    printObjectIs(1);
//    printObjectIs(Laptop("HP"));
//    printObjectIs(HandPhone("Samsung"));


    /*
    Casts di When Expression
    - Selain menggunakan If untuk melakukan pengecekan tipe data dan konversi tipe data
    - Kita juga bisa menggunakan when expression
    - Penggunaan when expression akan lebih sederhana dibanding if expression dalam melakukan pengecekan dan konversi tipe data
     */

//    printObjectWhen("Otniel");
//    printObjectWhen(1);
//    printObjectWhen(Laptop("HP"));
//    printObjectWhen(HandPhone("Samsung"));

    /*
    Unsafe Casts
    - Kotlin juga mendukung konversi tipe data secara paksa menggunakan kata kunci as
    - namun konversio menggunakan as sangat tidak aman jika tipe datanya tidak sesuai
     */

//    printString("Hello World"); // success
//    printString(1); // Error: ClassCastException

    /*
    Safe Nullable Casts
    - penggunaan as sangat tidak aman, namun kadang bisa menjadikannya aman, dengan menggunakan kata kunci as?
    - Dengan menggunakan kata kunci as? secara otomatis jika gagal melakukan konversi, akan diubah menjadi null
    - INGAT: Di Kotlin tdk direkomendasikan data yang bisa null
     */

    printStringSafe("Hello World");
    printStringSafe(1); //null
}
