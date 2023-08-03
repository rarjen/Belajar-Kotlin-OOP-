package data

interface TryOperation {
    fun sum(a: Int, b: Int): Int;
    fun subs(a: Int, b: Int): Int;
    fun multiple(a: Int, b: Int): Int;
    fun divide(a: Int, b: Int): Double;
    fun mod(a: Int, b: Int): Int;
}

class OperationTry() : TryOperation {
    override fun sum(a: Int, b: Int): Int {
        return a + b;
    }

    override fun subs(a: Int, b: Int): Int {
        return a - b;
    }

    override fun multiple(a: Int, b: Int): Int {
        return a * b;
    }

    override fun divide(a: Int, b: Int): Double {
        val convertA = a.toDouble();
        val convertB = b.toDouble();
        return convertA / convertB;
    }

    override fun mod(a: Int, b: Int): Int {
        return a % b;
    }

}
