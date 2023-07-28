package data

abstract class Animal {
    abstract val name: String;
    abstract fun run(): Unit; // Tidak boleh memasukkan body fun nya.
}

class Cat : Animal() {
    override val name: String = "Cat";
    override fun run() {
        println("${this.name} is runnning");
    }
}

class Dog : Animal()  {
    override val name: String = "Dog";
    override fun run() {
        println("${this.name} is running");
    }

}