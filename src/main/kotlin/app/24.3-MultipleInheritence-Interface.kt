package app

import data.HumanGo

fun main() {
    /*
    Multiple Inheritance dengan Interface
    - Inheritance di Class hanya boleh memiliki satu class Parent
    - Di Interface, sebuah class Child bisa memiliki banyak interface Parent
     */

    val humanGo = HumanGo("Otniel");
    humanGo.go();
    humanGo.sayHello("Leinto")
    humanGo.sayHelloConcrete("Kevin")
}