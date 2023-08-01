package app

import data.Fruit

fun main() {
    /*
    Operator Overloading
    - Kotlin mendukung operator overloading, artinya kita bisa membuat function dari operator" seperti oeprator matematika, dll
    - Kemampuan ini membuat kita bisa melakukan oeprasi apapun di object seperti layaknya tipe data integer
    - Ada banyaj sekali operator yg bisa di override di kotlin

    Membuat Operator Overloading
    - Untuk membuat oeprator overloading, kita bisa menggunakan kata kunci operator sebelum deklarasi fun nya
     */


    // jika tanpa overloading operator kita mengakses dengan cara Fruit.plus(100)
    val fruit = Fruit(100) + Fruit(100);
    println(fruit);

    val fruit1 = Fruit(100);
    val fruit2 = Fruit(100);
    val fruit3 = fruit1 + fruit2;
    println(fruit3);
    println(fruit3 - Fruit(10));

    // jika tanpa operator keyword akan seperti ini
//    fruit3 = fruit1.plus(fruit2)

    val fruitA = Fruit(100);
    val fruitB = Fruit(21);
    val fruitC = fruitA - fruitB;
    println(fruitC);
}
