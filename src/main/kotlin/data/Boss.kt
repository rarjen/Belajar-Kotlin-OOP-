package data

class Boss(val bossName: String) {

    //Inner Class (tidak bisa akses data class outer dan sebaliknya)
    class Employee(val name: String) {
        fun hi() {
//            println("Hi, my name is ${this.name}, and my boss's name is $bossName"); // error
            println("Hi, my name is ${this.name}")
        }
    }

    // Inner Class
    inner class Supervisor(val name: String) {
        fun hi() {
            println("Hi, my name is ${this.name}, and my boss's name is $bossName"); // error
        }
    }

}