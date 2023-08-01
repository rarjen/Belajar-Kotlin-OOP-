package app

import data.Account

fun main() {
    /*
    Observable Properties
    - Salah satu standar library yang disediakan oleh Kotlin untuk delegating di properties adl observable properties
    - Dengan observable properties, kita bisa tahu properties, value sebelum dan value setelah ketika diubah
     */

    val account = Account();

    account.description = "Example";
    account.description = "Diubah";
    account.description = "Hello World";

}