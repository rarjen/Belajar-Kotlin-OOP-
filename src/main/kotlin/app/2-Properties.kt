package app

import data.Person

fun main() {
    /**
     Properties
     * Properties / Fields / Attributes adalah data yang bisa kita sisipkan di dalam Object
     * Namun sebelum kita bisa memasukkan data di Properties, kita harus mendeklarasikan data apa aja yang dimiliki object tersebut
       di dalam deklarasi class-nya
     * Membuat Properties sama seperti membuat variable, bisa mutable atau immutable
     */

    /*
    Manipulasi Properties
    - Properties yang ada di object, bisa kita manipulasi. Tergantung mutable atau immutable.
    - Jika mutable, berarti kita bisa mengubah data properties nya, namun jika immutable, kita hanya bisa mengambil data properties nya saja
    - Untuk memanipulasi data properties, sama seperti cara pada variable
    - Untuk mengakses properties, kita butuh kata kunci . (titik) setelah nama object dan diikuti nama properties nya
     */

    val leinto = Person();
    leinto.firstName    = "Otniel"; //Manipulasi properties
    leinto.middleName   = "Kevin";
    leinto.lastName     = "Abiel";

    val lei = Person();
    lei.firstName   = "Daniel";
    lei.middleName  = "Ricciardo";
    lei.lastName    = "Verstappen";

    println(leinto.firstName);
    println(leinto.middleName);
    println(leinto.lastName);

    println("-----------------")

    println(lei.firstName);
    println(lei.middleName);
    println(lei.lastName);
}