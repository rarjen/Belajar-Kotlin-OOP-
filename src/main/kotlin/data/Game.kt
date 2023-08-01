package data

// tanpa data class
class Game(val name: String, val price: Int){
    // harus buat fun sebanyak properties
    operator fun component1(): String = name;
    operator fun component2(): Int = price;
}

// dengan ini maka tidak perlu membuat operator function componentX()
data class Game2(val name: String, val price: Int);