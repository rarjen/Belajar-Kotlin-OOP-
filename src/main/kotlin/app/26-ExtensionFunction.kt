package app

import data.Student
import data.sayGoodBye
import data.sayHello

fun main() {
    /*
    Extension Function
    - Pada materi Kotlin Dasar kita sudah membahas tentang Extension Function, yaitu menambahkan function pada tipe data
      yang sudah ada

    Extension Bukanlah Function di Class
    - Perlu diperhatikan, bahwa saat membuat extension function, kita tidak memodifikasi class aslinya
    - Extension function hanyalah sebuah function bantuan yang artinya, kita tidak bisa mengakses data private atau protected
      dari class tersebut

    Nullable Extension Function
    - Secara standar, extension fun hanya bisa untuk data yang tidak null
    - Jika kita ingin membuat extension fun yang bisa digunakan untuk data yang bisa null, kita perlu menggunakan kata kunci ?
     */

    val student = Student("Kevin", 22);
    student.sayHello("Leinto");

    val student2 = Student("Abiel", 21);
    student2.sayGoodBye("Verstappen");
}