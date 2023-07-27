package app

import data.User

fun main() {
    /*
    Properties di Constructor
    - Kotlin mendukung deklarasi properties langsung di primary constructor
    - Ini sangat berguna untuk mempersingkat saat kita ingin membuat properties, dan mengisi datanya lewat constructor
    - Jika propertiesnya sedikit masih aman, apabila banyak itulah yang menyulitkan. Daripada membuat propeorties 1 1, mending
      secara langsung bisa kita masukkan properties nya di dalam constructor
    - INGAT: HANYA BISA DIBUAT DI PRIMARY CONSTRUCTOR
     */

    val user1 = User("leinto777", "qwerty123");
    val user2 = User("lei777", "rahasia");

    user1.username = "otniel777";
    user1.password = "bukanqwerty";

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}

