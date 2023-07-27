package data

open class ShapeSuperkeyword {
    open val corner: Int = -1;

    open fun printName(): Unit {
        println("This is shape")
    }
}

class RectangleSuperProperties : ShapeSuperkeyword() {
    override val corner: Int = 4;
    val parentCorner: Int = super.corner
}

class TriangleSuperFunction : ShapeSuperkeyword() {
    override fun printName() {
        println("This is Triangle");
        super.printName();
    }
}