package app

import data.Boss

fun main() {
    /*
    Inner Class
    - Di Kotlin, kita bisa membuat class (Inner) di dalam class (Outer)
    - Namun walaupun class Inner tersebut berada di dalam class Outer, namun class Inner tidak bisa mengakses data yang ada
      di dalam class Outer
    - Agar class Inner bisa mengakses data yang ada di dalam class Outer, kita bisa menggunakan kata kunci inner
     */

    val employee = Boss.Employee("Kevin"); // cara akses inner class
    employee.hi();

    val supervisor = Boss("Otniel").Supervisor("Leinto");
    supervisor.hi();

    // contoh PZN
    val lei = Boss("Lei");
    val abiel = lei.Supervisor("Iel");
    abiel.hi();

}