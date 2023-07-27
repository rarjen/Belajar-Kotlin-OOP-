package app

import data.ManagerOverriding
import data.SuperManager
import data.VicePresidentOverriding

fun main() {
    /*
    Function Overriding
    - Function Overriding adalah kemampuan membuat ulang function yang sudah ada di class Parent
    - Secara standar, function di class adalah final, tidak bisa dibuat ulang di class Child
    - Agar function bisa dibuat ulang di class Child, kita harus menggunakan kata kunci open
     */

    val manager1 = ManagerOverriding("Kevin");
    manager1.sayHello("Goblin");

    val vp1 = VicePresidentOverriding("Otniel");
    vp1.sayHello("Spider-man");

    /*
    Final Overriding Function
    - Saat kita membuat ulang function di class Child, secara standar, function tersebut bersifat open, yang artinya bisa
      dibuat ulang di class Child dibawahnya lagi
    - Jika ingin membuat override function tidak bisa dibuat ulang oleh class Child dibawahnya lagi, kita harus menggunakan
      kata kunci final
     */

    val superManager = SuperManager("Abiel");
    superManager.sayHello("Super-man");
}