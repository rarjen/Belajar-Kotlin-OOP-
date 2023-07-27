package data

class PersonFunctionOverloading {
    var firstName: String = ""; // ini adalah properties
    var middleName: String? = null; // nullable variable/properties tidak dianjurkan
    var lastName: String = ""; // ini adalah properties

    fun sayHello(name: String): Unit {
        println("Hello $name, My name is $firstName $middleName $lastName");
    }

    fun sayHello(name: Int): Unit {
        println("Hello $name, My name is $firstName $middleName $lastName");
    }

    fun sayHello(namaDepan: String, namaBelakang: String): Unit {
        println("Hello $namaDepan $namaBelakang, My name is $firstName $middleName $lastName");
    }

}