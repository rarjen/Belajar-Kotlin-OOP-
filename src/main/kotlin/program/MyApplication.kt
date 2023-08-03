package program

import annotations.Fancy

@Fancy(author = "Otniel") //hanya untuk keterangan karena akses seperti ini saja (sehingga tidak berguna)

class MyApplication(val name: String, val version: Int) {

    fun info(): String = "Application $name-$version";
}