package app

import data.Company
import data.CompanyHasCode

fun main() {
    /*
    HashCode Function
    - hashCode adl fun yg digunakan sbg representasi angka unit utk objek yg kita buat
    - Fun hascCode berguna saat kita ingin mengkonversi objek kita menjadi angka
    - Salah satu penggunaan hasCode yg bnyk dilakukan adl di struktur data, misal untuk memastikan tdk ada data duplicate,
      agar lebih mudah, di cek nilai hashCode nya, jika hashCode sama, maka dianggap objectnya sama.
     */

    val company1 = CompanyHasCode("Leinto Corp");
    val company2 = CompanyHasCode("Leinto Corp");

    println(company1.hashCode());
    println(company2.hashCode());
    println(company1.hashCode() == company2.hashCode()); //true


}