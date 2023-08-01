package app

import data.Game
import data.Game2

fun main() {
    /*
    Destructuring Declaration
    - Destructuring declaration adalah membuat multiple variables dari sebuah object
    - Destructuring tidak bisa dilakukan untuk semua object,  hanya objek yang memiliki function componentX() yang bisa dilakukan
      destructuring
    - Saat kita membuat data class, secara otomatis akan dibuatkan function componentX() sesuai dengan jumlah parameter nya
     */

    val game = Game("Zelda", 500_000);
//    val name = game.name;
//    val price = game.price;

    // Destructuring Declaration
    val(name, price) = game;
    println(name);
    println(price);

    val game2 = Game2("Minecraft", 49_999);
    val(name2, price2) = game2;
    println(name2);
    println(price2);


}