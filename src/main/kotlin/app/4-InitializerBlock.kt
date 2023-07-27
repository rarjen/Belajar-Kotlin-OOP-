package app

import data.Car

fun main() {
    /*
    Initializer Block
    - Initializer Block adl blok kode yg akan dieksekusi ketika constructor dipanggil.
    - Kita bisa memasukkan kode program di dalam initializer block.
     */

    val lancer = Car("Mitsubishi");
    println(lancer.brand);
    // Car Mitsubishi dibuat
    // Mitsubishi

    println("-----------------------")

    var alphard = Car("Toyota", 2022);
    println(alphard.brand);
    println(alphard.year);
}