package app

import data.Token

fun main() {
    /*
    Inline Class
    - Kadang kita hanya membuat class dengan satu properties
    - Terlalu banyak class akan ada konsekuensinya, yaitu memakan konsumsi memory yang lebih banyak ketika program kita berjalan
    - Kotlin memiliki kemampuan untuk mengubah class menjadi inline dengan menggunakan kata kunci inline
     */

    val token = Token("qwerty");
    println(token.value);
    println(token.toUpper());
}