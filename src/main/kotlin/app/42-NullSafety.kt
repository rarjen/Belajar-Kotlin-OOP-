package app

data class Friend(val name: String);

fun sayHello(friend: Friend?) {
//    println("Hello ${friend.name}"); // akan error karena bisa null

    // Ini disebut cara Safe Call (?)
    println("Hello ${friend?.name}");
}

// pengecekan null dengan if expression
fun sayGoodBye(friend: Friend?) {
    if (friend != null) {
        println("GoodBye ${friend.name}")
    }
}

// Elvis Operator
fun sayBaby(friend: Friend?) {
    val name = friend?.name ?: ""; // Mirip ternaru operator di JS
//    val name = friend?.name ?: "Friend"; // Mirip ternaru operator di JS
    println("Hello baby $name");
}

// !! Operator
fun sayLove(friend: Friend?) {
//    val name = friend!!.name // jika ada null maka akan error
//    println("I Love You, $name");

    // contoh lain
    val notNullFriend = friend!!;
    val name = notNullFriend.name;
    println("I Love You, $name")
}

fun main() {
    /*
    Null Safety
    - Jika teman-teman sebelumnya pernah belajar bahasa pemrograman Java, di Java kita sering mengenal error bernama NullPointerException. Error ini terjadi ketika kita mengakses properties atau functions di null object
    - Di Kotlin, hal ini sangat jarang terjadi, karena sejak awal di Kotlin tidak direkomendasikan untuk menggunakan nullable type.
    - Walaupun akan menggunakan nullable type, di Kotlin kita memberitahu secara eksplisit menggunakan karakter ? (tanda tanya)
    - Kali ini kita akan bahas cara-cara agar terhindar dari error null di Kotlin sehingga tidak sering kejadian seperti di Java
     */
    sayHello(Friend("Kevin"));
    sayHello(null);

    sayGoodBye(Friend("Otniel"));
    sayGoodBye(null); //nothing

    sayBaby(Friend("Idk"));
    sayBaby(null); // Hello baby

    /*
    !! Operator
    - Jika kita sangat mencintai NullPointerException :D
    - Dan kita benar-benar yakin bahwa variabel tersebut tidak null
    - Maka kita bisa menggunakan kata kunci !! untuk mengkonversi dari data yang nullable menjadi data tidak nullable
    - Tapi ingat, konsekuensinya, jika sampai ternyata datanya null, maka akan terjadi error
     */

    sayLove(Friend("Jesus"));
//    sayLove(null); // error
}