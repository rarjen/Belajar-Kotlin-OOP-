package app

import data.PersonThisKeyword

fun main() {
    /*
    This Keyword
    - this adalah keyword yang bisa digunakan untuk mereferensikan object saat ini
    - this hanya bisa digunakan di dalam class itu sendiri
    - Biasanya, this digunakan untuk mengakses properties yang tertutup oleh parameter dengan nama yang sama
    - Sangat direkomendasikan menggunakan this untuk penanda akses ke propertinya sendiri
     */

    val person1 = PersonThisKeyword();

    person1.firstName = "Jancok";
    person1.middleName = "Koen";

    person1.sayHello("Otniel", "Kevin");
}