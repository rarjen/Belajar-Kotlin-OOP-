package data
interface InteractionKonflik {
    val

}

interface MoveA {
    // concrete function
    fun move(): Unit = println("Move A");
}

interface MoveB {
    fun move(): Unit = println("Move B");
}

//class Human()