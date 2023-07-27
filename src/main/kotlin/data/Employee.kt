package data

open class Employee (val name: String) { //parent class
    // primary constructor
    fun sayHello(name: String): Unit {
        println("Hello $name, my name is ${this.name}");
    }
}

final class Manager(name: String) : Employee(name); // child class
final class VicePresident(name: String) : Employee(name); // child class