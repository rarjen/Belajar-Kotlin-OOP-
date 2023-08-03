package app

import exception.ValidationException

fun finallySayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    }
    println("Hello ${name}");
}

fun main() {
    /*
    Finally
    - Finally adalah block kode yang bisa ditambahkan di Try Catch
    - Block finally akan selalu dieksekusi setelah kode program Try Catch di eksekusi, baik itu sukses ataupun gagal
    - Ini cocok untuk menempatkan kode yang memang harus dilakukan tidak peduli baik itu kodenya sukses atau gagal
     */

    try {
        finallySayHello("Kevin");
        finallySayHello("");
//        multipleCatchSayHello(null);
    } catch (error: ValidationException) { //harus diawali oleh lowercase
        println("Error with message: ${error.message}");
    } catch (error: Throwable) {
        println("Error with message: ${error.message}")
    } finally {
        println("Finally will always be executed!");
    }
}