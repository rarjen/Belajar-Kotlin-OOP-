package app

import data.Human

fun main() {
    /*
    Concrete Function di Interface
    - Function di Interface memiliki pengecualian, tidak harus abstract
    - Kita bisa membuat concrete function di Interface, artinya function tersebut tidak wajib untuk dibuat ulang di child Class nya
     */

    val human = Human("Kevin");
    human.sayHello("Leinto");
    human.sayHelloConcrete("Abiel");
}