package app

import data.Television

fun main() {
    /*
    Late-Initialized properties
    - Standarnya, properties di Kotlin wajib di inisialisasi di awal saat deklarasi properties tersebut
    - Namun di Kotlin kita juga bisa menunda inisialisasi data para properties
    - Dengan menggunakan kata kunci lateinit, kita bisa membuat properties tanpa harus langsung mengisi datanya
    - Kata kunci lateinit hanya bisa digunakan di var, tidak bisa digunakan di val
     */

    val television = Television();
//    println(television.brand) // jika kita langsung akses brand nya maka akan error

    television.initTelevision("Samsung") // harus dipanggil dulu fun nya
    println(television.brand)

    television.brand = "LG"; // ini juga bisa
    println(television.brand);
}