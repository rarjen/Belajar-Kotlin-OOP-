package app

import data.Login
import kotlin.math.log

//typealias
fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login);
}
fun main() {
    /*
    Destructuring Lambda Parameter
    - Destructuring juga bisa dilakukan di lambda paramater
    - Hal ini bisa mempermudah kita saat ingin mengakses data yang ada di param
     */

    val login = Login("Otniel", "qwerty123");

    // Biasanya kita melakukan ini
//    login(login) {login ->
//        login.user == "Otniel" && login.pass == "qwerty123"
//    }

    // Dengan destructuring

    // jadi kita bisa melakukan destructuring di lambda paramater
    login(login){ (user, pass) ->
        user == "Otniel" && pass == "qwerty123"
    }


}