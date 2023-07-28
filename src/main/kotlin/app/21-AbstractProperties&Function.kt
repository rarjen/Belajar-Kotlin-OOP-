package app

import data.Cat
import data.Dog

fun main() {
    /*
    Abstract Properties & function
    - Saat kita membuat class yang abstract, kita bisa membuat properties abstract dan function abstract di dalam class tersebut
    - Properties dan function yang bersifat abstract, artinya wajib dibuat ulang di class Child nya
     */

    val cat = Cat();
    println(cat.name);
    cat.run();

    val dog = Dog();
    println(dog.name);
    dog.run();
}