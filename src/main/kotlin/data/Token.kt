package data

inline class Token(val value: String, /*val age: Int*/) { // akan error apabila comment dibuka
    fun toUpper(): String = value.toUpperCase(); // inline fun
}