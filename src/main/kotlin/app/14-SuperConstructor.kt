package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    /*
    Super Constructor
    - Kata kunci super tidak hanya bisa digunakan untuk mengakses function atau properties di class Parent
    - Kata kunci super juga bisa digunakan untuk mengakses constructor class Parent
    - Mengakses constructor class Parent hanya bisa dilakukan di dalam constructor class Child
     */

    val premiumCustomer = PremiumCustomer("Otniel");
    println(premiumCustomer.name);

    println("-----------------------")
    val pc = PremiumCustomer("Abiel", 90_000);
    println(pc.name);
    println(pc.type);
    println(pc.balance);

    println("-----------------------")
    val executiveCustomer = ExecutiveCustomer("Kevin", 1_000_000)
    println(executiveCustomer.name);
    println(executiveCustomer.balance);

    println("-----------------------")
    val ec = ExecutiveCustomer("Leinto");
    println(ec.name);
    println(ec.type);
    println(ec.balance);

}