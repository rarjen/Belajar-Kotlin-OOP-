package data

class CarSecondaryConstructor(brandParam: String, nameParam: String, yearParam: Int) {

    init {
        println("Car $brandParam dibuat");
    }

    // Wajib eksekusi param primary nya
    // Misalnya kita hanya membutuhkan 2 param saja dari total 3 primary param

    // memanggil primary constructor
    constructor(brandParam: String, nameParam: String) : this(brandParam, nameParam, 2020) {
         println("Secondary Constructor 1")
    }

    // memanggil secondary constructor
    // tidak masalah memanggil sceondary constructor yang lain karena ujung"nya sama" memanggil primary constructor
    constructor(brandParam: String) : this(brandParam, ""){
        println("Secondary Constructor 2")
    }

    //    println("Car Dibuat") // Ini error
    var brand: String = brandParam;
    var name: String = nameParam;
    var year: Int = yearParam;
}