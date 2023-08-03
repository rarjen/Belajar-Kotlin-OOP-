package app

import exception.ValidationException

fun tryCatchSayHello(name: String) {
    if(name.isBlank()) {
        throw ValidationException("Name is blank")
    }
    println("Hello $name");
}

fun main() {
    /*
    Try Catch
    - Jika dalam program Kotlin kita terjadi exception, maka secara otomatis program kita akan terhenti
    - Kadang kita tidak ingin sampai kejadian seperti itu
    - Di Kotlin, kita bisa menangkap exception, lalu melakukan sesuatu jika terjadi error
    - Try Catch di Kotlin digunakan untuk mencoba melakukan sesuatu, jika terjadi error maka akan ditangkap dan
      kita bisa memberi reaksi sesuai dengan yang kita mau
     */

    try {
        tryCatchSayHello("Kevin");
        tryCatchSayHello("");
    } catch (error: ValidationException) { //harus diawali oleh lowercase
        println("Error with message: ${error.message}");
    }

}