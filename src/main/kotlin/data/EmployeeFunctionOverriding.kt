package data

open class EmployeeFunctionOverriding(val name: String) {
    // primary constructor
    open fun sayHello(name: String): Unit {
        println("Hello $name, my name is ${this.name}");
    }
}

open class ManagerOverriding(name: String) : EmployeeFunctionOverriding(name) {
    override fun sayHello(name: String): Unit {
        println("Hello $name, my name is manager ${this.name}")
    }
} // child class
open class VicePresidentOverriding(name: String) : EmployeeFunctionOverriding(name) {
    final override fun sayHello(name: String) {
        println("Hello $name, my name is vp ${this.name}")
    }
} // child class

class SuperManager(name: String) : ManagerOverriding(name) {
    override fun sayHello(name: String) { //bisa di override krn default overriding adl open
        println("Hello $name, my name is super manager ${this.name}")
    }
}

class SuperVicePresident(name: String) : VicePresidentOverriding(name) {
    // Tidak dapat melakukan overriding dari sayHello vp (ERROR)
//    override fun sayHello(name: String) {
//        println("Hello $name, my name is super vp ${this.name}")
//    }
}