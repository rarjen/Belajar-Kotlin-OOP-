package app

import data.Gender
import data.GenderPropertiesFunction

fun main() {
    /*
    Enum Class
    - Enum class merupakan representasi dari class yang sudah tetap nilainya
    - Biasanya enum class digunakan untuk jenis data yang sudah baku, seperti jenis kelamin, arah mata angin dan sejenisnya
    - Untuk membuat enum class, kita bisa menggunakan kata kunci enum sebelum deklarasi class nya
    - Kita tidak bisa membuat object dari class enum, namun kita bisa mendeklarasikan langsung object yang tersedia untuk enum class tersebut
     */

    val man = Gender.MALE;
    println(man)

    val woman = Gender.FEMALE;
    println(woman)

    var allGenders: Array<Gender> = Gender.values();
    println(allGenders)
    // konversi ke list
    println(allGenders.toList()); //[MALE, FEMALE]

    // saat kita ingin melakukan konversi dari string. Saat input data kita menggunakan string
    // misal kita ingin konversi jadi object gender nya
    val manFromString = Gender.valueOf("MALE"); // value harus sama dgn enum
    val womenFromString = Gender.valueOf("FEMALE"); // value harus sama dgn enum

    println(manFromString); //MALE
    println(womenFromString); //FEMALE


    /*
    Properties & Function di Enum Class
    - Enum class adl class seperti biasa pada umumnya
    - Enum class bisa memiliki properties ataupun function
    - Namun jk properties nya di set menggunakan constructors, maka saat pembuatan object enum, wajib diisi, dan jika terdapat
      abstract function, wajib di override pada saat pembuatan object enum
     */

    val man2 = GenderPropertiesFunction.MALE;
    val woman2 = GenderPropertiesFunction.FEMALE;
    man2.displayDescription(); //Male
    woman2.displayDescription(); //Female
}