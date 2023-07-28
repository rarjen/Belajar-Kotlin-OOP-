package data

class Television {
    // biasanya saat membuat properties harus di init dahulu value nya atau mengambil dari constructor
    // namun dengan lateinit kita bisa mengisikan namannya nanti (mirip async)
    lateinit var brand: String;

    fun initTelevision(brand: String) {
        this.brand = brand;
    }

}