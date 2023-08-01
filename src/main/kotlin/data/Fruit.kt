package data

data class Fruit(val total: Int) {

    // operator overloading sehingga bisa menggunakan opr matematika plus
    // membalikan tipe data Fruit
    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(total + fruit.total);
    }

    operator fun minus(fruit: Fruit): Fruit  {
        return Fruit(total - fruit.total);
    }
}