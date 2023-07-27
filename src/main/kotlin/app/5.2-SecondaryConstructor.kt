package app

import data.CarWithoutPrimary

fun main() {
    val car1 = CarWithoutPrimary("Toyota", "Alphard");
    val car2 = CarWithoutPrimary("Toyota", "Alphard", 2002);

    println(car1.brand);
    println(car1.name);
    println(car1.year);

    println("--------------------------")

    println(car2.brand);
    println(car2.name);
    println(car2.year);
}