package data

class CarWithoutPrimary {

    var brand: String = "";
    var name: String = "";
    var year: Int = 2020;

    constructor(brandParam: String, nameParam: String,) {
        brand = brandParam;
        name = nameParam;
    }

    // memanggil secondary construct 1
    // boleh memanggil tapi tidak wajib
    constructor(brandParam: String, nameParam: String, yearParam: Int) : this(brandParam, nameParam) {
        year = yearParam;
    }
}