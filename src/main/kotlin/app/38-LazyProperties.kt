package app

import data.Account

fun main() {
    /*
    Lazy Properties
    - Selain delegating di class, Kotlin mendukung delegating di properties. Namun materi ini tidak akan dibahas disini,
      karena butuh mengerti dahulu tentang Generic Programming. Materi Delagating di Properties akan dibahas di series Kotlin Generic
    - Salah satu implementasi delegating properties yang sudah disediakan oleh Kotlin adalah, lazy properties
    - Lazy adalah standar library yang telah disediakan agar properties baru diinisialisasi ketika properties itu diakses
    - Lazy akan tampil apabila di panggil
     */

    val account = Account();
    println(account.name); // Lazy propeties di call sekali
    println(account.name);
    println(account.name);

    /*
    Output:
    Name is called
    Kevin
    Kevin
    Kevin
     */

}