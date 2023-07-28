package app

import data.City
import data.Country
import data.Location

fun main() {
    /*
    Abstract Class
    - Saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract
    - Abstract class artinya, class tersebut tidak bisa dibuat sebagai object, hanya bisa diturunkan
     */

//    val location = Location("Semarang") //error => Object tidak bisa dibuat dari abstract class
    val city = City("Jakarta");
    val country = Country("Semarang");

    println(city.name);
    println(country.name);
}