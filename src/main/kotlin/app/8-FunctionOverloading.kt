package app

import data.PersonFunctionOverloading

fun main() {
    /*
    Function Overloading
    - Function Overloading adalah kemampuan membuat function dengan nama yang sama di dalam class
    - Untuk membuat function dengan nama yang sama, kita wajib menggunakan parameter yang berbeda, bisa tipe parameter yang berbeda,
      atau jumlah parameter yang berbeda
    - Jika return value berbeda juga tidak bisa, misal function pertama adalah unit sedangkan yang kedua adalah memiliki return
      maka akan error
     */

    val person1 = PersonFunctionOverloading();

    person1.firstName = "Otniel";
    person1.middleName = "Kevin";
    person1.lastName = "Abiel";

    person1.sayHello("Leinto");
    person1.sayHello(1);
    person1.sayHello("Fast", "Furious");

}