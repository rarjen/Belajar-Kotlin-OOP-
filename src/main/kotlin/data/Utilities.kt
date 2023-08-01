package data

object Utilities {
    var name: String = "My Utilities"; // disarankan menggunakan val agar tidak dapat diubah
    fun toUpper(value: String): String {
        return value.toUpperCase();
    }
}