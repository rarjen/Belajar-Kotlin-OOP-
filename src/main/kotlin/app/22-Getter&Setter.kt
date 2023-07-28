package app

import data.BigNote
import data.Note

fun main() {
    /*
    Getter & Setter
    - Di bahasa pemrograman Java, ada sebuah konsep yang bernama Getter dan Setter saat membuat properties
    - Getter adalah function yang dibuat untuk mengambil data properties
    - Setter adl function untuk mengubah data propertie
    - Di kotlin, kita tidak perlu manual untuk membuat function Getter dan Setter nya, karena sudah difasilitasi sehingga lebih mudah
     */

    val note = Note("Diary");

    note.title = "Dear Diary"; // otomatis eksekusi title
    println(note.title); // otomatis eksekusi get

    /*
    Optional Getter dan Setter
    - Getter dan Setter tidak wajib dideklarasikan semua di Kotlin,
    - Kita bisa hanya mendeklarasikan Getter atau hanya Setter
     */

    //Kode : Kotlin Getter
    val bigNote = BigNote("my first diary");
    println(bigNote.title);
    println(bigNote.bigTitle);

}