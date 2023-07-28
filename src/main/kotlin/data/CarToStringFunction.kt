package data

class CarToStringFunction (val name: String) {
    override fun toString(): String {
        return "Car ${this.name} with override toString function";
    }
}