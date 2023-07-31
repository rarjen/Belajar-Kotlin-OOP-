package data

enum class Gender {
    MALE,
    FEMALE
}

//Properties & Function di Enum Class
enum class GenderPropertiesFunction(val description: String) {
    MALE("Male"), //Wajib diisi
    FEMALE("Female");

    fun displayDescription() {
        println(description);
    }
}