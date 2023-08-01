package data

interface Base {
    fun sayHello(name: String);
    fun sayGoodBye(name: String);
}

class MyBase() : Base {
    override fun sayHello(name: String) {
        println("Hello $name");
    }

    override fun sayGoodBye(name: String) {
        println("GoodBye $name");
    }
}

// Delegation Manual
// constructor dimasukkan base (parent)
// melakukan delegasi class Base ke object base
class Delegate(val base: Base): Base {
    // melakukan delegasi fun say hello milik class base ke class delegate
    override fun sayHello(name: String) {
        base.sayHello(name);
    }

    override fun sayGoodBye(name: String) {
        base.sayGoodBye(name);
    }
}

// Delegation Otomatis
// Dengan demikian semua function di dlm interface Base di delegasikan ke sini
class DelegateAutomatic(val base: Base) : Base by base; // base dibelakanh adalah properties dari val base


// Bisa juga kita melakukan override function tertentu sehingga semua tidak di delegasikan
class DelegateOverride(val base: Base) : Base by base {
    override fun sayHello(name: String) {
        println("Say Hello Override, $name");
    }
}