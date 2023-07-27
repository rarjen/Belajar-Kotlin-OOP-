package data

class PersonThisKeyword(var firstName: String = "") {
    var middleName: String = "";

    fun sayHello(firstName: String, middleName: String): Unit {
        println("Hello $firstName $middleName, my name is ${this.firstName} ${this.middleName}");
    }
}