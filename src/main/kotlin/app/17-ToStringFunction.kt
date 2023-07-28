package app

import data.CarToStringFunction

fun main() {
    /*
    toString Function
    - toString() adalah function yang digunakan untuk memberitahu representasi String dari object
    - Saat kita melakukan println object, sebenarnya function toString() akan dipanggil
    - Standarnya, function toString() akan mengembalikan referensi kode unik dari object
    - Kita bisa meng-override function toString() jika ingin mengubah representasi dari String pada object kita
     */

    val car1 = CarToStringFunction("BMW");
    println(car1.toString());
    println(car1) // bisa juga seperti ini
}