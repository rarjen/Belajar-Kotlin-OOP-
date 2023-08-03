package app

import exception.NullException
import exception.ValidationException

fun multipleCatchSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    }
    println("Hello ${name}");
}

fun main() {
    /*
    Multiple Catch
    - Saat kita mengeksekusi sebuah kode program di blok Try, bisa dimungkinan tidak hanya terjadi satu jenis exception,
      bisa saja terjadi beberapa jenis exception
    - Di Kotlin, kita bisa menggunakan multiple block Catch, untuk menangkap jenis exception yang berbeda
     */

    try {
        multipleCatchSayHello("Kevin");
        multipleCatchSayHello("");
//        multipleCatchSayHello(null);
    } catch (error: ValidationException) { //harus diawali oleh lowercase
        println("Error with message: ${error.message}");
    } catch (error: Throwable) {
        println("Error with message: ${error.message}")
    }
}