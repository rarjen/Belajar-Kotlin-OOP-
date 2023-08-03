package app

import data.EmployeeFunctionOverriding
import data.ManagerOverriding
import data.VicePresidentOverriding


fun main() {
    /*
    Polymorphism
    - Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
    - Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
    - Polymorphism erat hubungannya dengan Inheritance
     */

    // Harus pake var agar bisa berubah bentuk (polymorphism)
    // Bisa merubah behavior
    var employee: EmployeeFunctionOverriding = EmployeeFunctionOverriding("Otniel");
    employee.sayHello("Kevin");

    employee = ManagerOverriding("Horner");
    employee.sayHello("Kevin");

    employee = VicePresidentOverriding("Lei");
    employee.sayHello("Leinto");
}