package data

class Note(title: String) {

    // jika val kita tidak bisa buat setter
    var title: String = title
//        get() = title; //ini juga bisa namun disarankan menggunakan field
//        get() {
//            return field
//        } // jika get dengan body
        get() = field; // bisa juka ditambahkan body seperti pada set(value)
        set(value) {
            // tdk perlu deklarasi tipe data krn value akan otomatis jadi sama dengan properties nya
            if (value.isNotBlank()) {
                field = value;
            } else {
                println("Invalid Title")
            }
        }
}

class BigNote(val title: String) {
    val bigTitle: String
        get() = this.title.toUpperCase();
}