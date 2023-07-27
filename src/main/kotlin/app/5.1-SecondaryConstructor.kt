package app

import data.CarSecondaryConstructor

fun main() {
    /*
    Secondary Constructor
    - Kotlin mendukung pembuatan constructor lebih dari 1 sama seperti di Java
    - Constructor yg utama yg terdapat di Class, disebut primary constructor, construcotr tambahan yang bisa kita buat lagi
      adalah secondary constructor
    - Saat membuat constructor, kita wajib memanggil primary constructor jika ada primary constructor
    - Primary construct saat kita mau buat code program harus buat init, sedangkan pada secondary constructor lebih mirip ke fun
      yang body nya bebas dimasukkan kode program
     */
    val car1 = CarSecondaryConstructor("Toyota");
//    car1.year = 2004;

    println(car1.brand);
    println(car1.name);
    println(car1.year);
    println("--------------------------")

    val car2 = CarSecondaryConstructor("Mitsubishi", "Lancer");
    println(car2.brand);
    println(car2.name);
    println(car2.year);

}