package data

class Student(var name: String, val age: Int);

fun Student.sayHello(name: String) {
    println("Hello $name, my name is ${this.name}, and my age is ${this.age}");
};

fun Student?.sayGoodBye(name: String) {
    if (this != null) {
        println("Goodbye $name, my name is ${this.name}, and i'm ${this.age} yrs old. See you!")
    };

    // Kita juga bisa menambahkan seperti ini. Namun kotlin sangat pintar dan bisa tau kalo kita sudah buat pengecekan tidak null
//    println("Goodbye $name, my name is ${this?.name}, and i'm ${this?.age} yrs old. See you!")
}

// Extension Proeprties
val Student.upperName : String
    get() = this.name.toUpperCase();

