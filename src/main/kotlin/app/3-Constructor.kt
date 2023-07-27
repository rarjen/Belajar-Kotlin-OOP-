package app

import data.Car

fun main() {
    /*
    Constructor
    - Saat kita membuat Object, maka kita seperti memanggil sebuah function
    - Di dalam class Kotlin, kita bisa membuat Constructors, Constructors mirip seperti function yang akan dipanggil saat pertama kali Object dibuat.
    - Mirip seperti di Function, kita bisa memberi parameter pada Constructors
     */

    // Wajib memasukkan param pada constructor
    val avanza = Car("Toyota");
    avanza.year = 2014; // Tetap bisa di reassign

    val almaz = Car("Wuling");
    val lancer = Car("Mitsubishi", 2004);

    println(avanza.brand);
    println(avanza.year); //2014
    println("--------------");
    println(almaz.brand);
    println(almaz.year);
    println("--------------");
    println(lancer.brand);
    println(lancer.year);
}