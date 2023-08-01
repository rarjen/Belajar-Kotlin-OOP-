package data

class Application(val name: String) {

    object Utilities {
        fun toUpper(name: String): String {
            return name.toUpperCase();
        }
    }

    // Companion Object
    companion object {
        fun hello(name: String): Unit {
            println("Hello $name");
        }
    }
}

class OperationTest(val a: Int, val b: Int){
    companion object /*Operation*/ { // Operation ini opsional
        fun sum(a: Int, b: Int): Int {
            return a + b;
        }

        fun subs(a: Int, b: Int): Int {
            return a - b;
        }
    }
}