package data

class PersonFunction {
    var firstName: String = "";
    var middleName: String? = null;
    var lastName: String = "";

    fun sayHello(name: String) {
        println("Hello $name, my name is $firstName");
    }

    fun run() {
        println("I'm running as fast as i can");
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName";
    }
}