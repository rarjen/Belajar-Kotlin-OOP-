package data

class StudentTypeAlias(val name: String) {

    fun hello(name: String) {
        println("Hello $name, my name is student ${this.name}");
    }
}