package app

import data.Product

fun main() {
    /*
    Data Class
    - Kadang kita sering membuat class yang hanya digunakan sebagai representasi dari data
    - Data Class cocok digunakan dalam hal ini
    - Data Class merupakan class yang secara otomatis akan membuatkan function equals, hashCode, toString dan copy dari semua
      properties yang terdapat di primary constructors yang dimiliki oleh data class
    - Disarankan memakai data class jika ingin membuat class dengan representasi data

    Copy Data Class
    - Data class memiliki function copy yang bisa digunakan untuk menduplikasi object.
    - Bahkan metode copy yang terdapat di data class bisa digunakan untuk menduplikasi sekaligus mengubah properties nya
     */

    val product = Product("Indomie", 2_500, "Food");

    val product2 = product.copy(name = "Supermie");

    println(product)
    println(product2)
}