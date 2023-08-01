package app

typealias StringSupplier = () -> String; // Lambda

fun sayHello(supplier: StringSupplier) {
    println("Hello, ${supplier()}");
}

fun main() {
    /*
    Type Alias Untuk Function
    - Type Alias tidak hanya bisa digunakan untuk class saja, namun bisa untuk function
    - Dengan menggunakan Type Alias untuk function, kita akan lebih mudah saat menggunakan function sebagai parameter,
      karena lebih sederhana
     */

    sayHello { "Kevin" };
}