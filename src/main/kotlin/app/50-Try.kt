package app
import java.util.Scanner

import data.OperationTry

var option = false

fun main() {
    val operation = OperationTry();
    val reader = Scanner(System.`in`)
    try {
        do {
            print("Bilangan 1: ");
            val a: Int = reader.nextInt();

            print("Bilangan 2: ");
            val b: Int = reader.nextInt();

            val pilihan: String = """
            1. Tambah
            2. Kurang
            3. Kali
            4. Bagi
            5. Mod
            q. Quit
        """.trimIndent()
            println(pilihan);

            print("Masukkan Operasi: ");
            val operasi: String = readLine()!!;

            when(operasi) {
                "1" -> println(operation.sum(a, b));
                "2" -> println(operation.subs(a, b));
                "3" -> println(operation.multiple(a, b));
                "4" -> println(operation.divide(a, b));
                "5" -> println(operation.mod(a, b));
                "q" -> break
                else -> println("Input tidak dikenali");
            }

            print("Ingin Melanjutkan? (Y/n): ");
            val opsi: String = readLine()!!;
            if (opsi == "y"){
                option = true;
            } else if (opsi == "n") {
                break
            } else {
                println("Input tidak diketahui")
                option = true;
            }
        } while (option)
    } catch (error: Throwable) {
        option = true
        println("Error Pesan: ${error.message}")
    }

    println("Program Selesai");
}