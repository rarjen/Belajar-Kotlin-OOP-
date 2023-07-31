package data
interface InteractionKonflik {
    val name: String; // tanpa value
    fun sayHelloConcrete(name: String) {
        println("Hello $name concrete, my name is ${this.name}");
    }
}


interface GoKonflik : InteractionKonflik {
    fun go () {
        println("Go!")
    }
}

interface MoveA {
    // concrete function
    fun move(): Unit = println("Move A");
}

interface MoveB {
    fun move(): Unit = println("Move B"); // error karena ada yang konflik sehingga harus di override
}

class HumanKonflik(override val name: String) : GoKonflik, MoveA, MoveB {
    override fun move() {
        // mengakses kedua fun
        super<MoveA>.move();
        super<MoveB>.move();
        println("Human move");
    }
}

//class Human()