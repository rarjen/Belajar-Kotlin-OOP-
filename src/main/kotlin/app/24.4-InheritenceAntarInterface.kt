package app

import data.HumanGo
import data.HumanInterfaceInheritance

fun main() {
    /*
    Inheritence antar Interface
    - Tidak hanya Class yang punya kemampuan Inheritance
    - Interface juga bisa melakukan Inheritance dengan Interface lain
    - Namun Interface tidak bisa melakukan Inheritance dengan Class
     */

    val human = HumanInterfaceInheritance("Kevin");
    human.sayHello("Kevin");
    human.goInheritance();

}