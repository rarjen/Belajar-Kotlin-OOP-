package app

import data.Application
import data.StudentTypeAlias

typealias Pelajar = StudentTypeAlias;
typealias App = Application;
typealias App2 = data2.Application;

fun main() {
    /*
    Type Alias
    - Kotlin mendukung Type Alias
    - Type Alias adl membuat nama berbeda dari tipe data yg telah ada
    - Biasanya ini digunakan ketika ada tipe data dengan nama yg sama, atau untuk mempersingkat tipe data
      sehingga kita tdk perlu menulisnya terlalu panjang
     */

    val pelajar = Pelajar("Kevin");
    println(pelajar.name);

    pelajar.hello("Leinto")

    val app = App("Tokopedia");
    println(app.name);

    App.hello("Kevin");

    val app2 = App2("PZN");
    println(app2.name);

}