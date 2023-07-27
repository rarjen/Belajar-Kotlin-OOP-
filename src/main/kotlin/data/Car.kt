package data

class Car (brandParam: String, yearParam: Int = 2020) {

    init {
        println("Car $brandParam dibuat");
    }

//    println("Car Dibuat") // Ini error
    var brand: String = brandParam;
    var year: Int = yearParam;

}