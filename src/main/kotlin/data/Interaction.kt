package data

interface Interaction {
    // abstract properties & function
    val name: String; // tanpa value
    fun sayHello(name: String); // tanpa body

    fun sayHelloConcrete(name: String) {
        println("Hello $name concrete, my name is ${this.name}");
    }
}

// Multiple Interface
interface Go {
    fun go () {
        println("Go!")
    }
}

// Inheritance antar Interface
interface GoInheritance : Interaction {
    fun goInheritance(): Unit {
        println("Go!, ${this.name}")
    }
}

open class Contoh();

class Human(override val name: String) : Interaction {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}");
    }
    // function concrete tidak wajib di override
}

// Multiple Inheritance
// Hanya bisa mewariskan 1 super class namun bisa banyak interface
class HumanGo(override val name: String) : Contoh(), Interaction, Go {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}");
    }
}

// Inheritance antar Interface
// Tidak perlu inherit Interactio karena GoInheritance sudah inherit Interaction
class HumanInterfaceInheritance(override val name: String) : GoInheritance {
    override fun sayHello(name: String) {
        println("Hello $name, Interface Inheritance ${this.name}")
    }

}