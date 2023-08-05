package app

import data.Delegate
import data.DelegateAutomatic
import data.DelegateOverride
import data.MyBase

typealias Delegasi = DelegateAutomatic; //alias

fun main() {
    /*
    Delegation
    - Salah satu design pattern lain yang populer adalah Delegation
    - Delegation sederhananya adalah meneruskan properties atau function ke object yang lain
    - Kotlin mendukung delegation tanpa harus membuat kode secara manual
     */

    val base = MyBase();
    base.sayHello("Kevin");

    // sebenarnya ini memanggil say hello dari object base
    val baseDalegate = Delegate(base);
    baseDalegate.sayHello("Leinto"); //Hello Leinto
    baseDalegate.sayGoodBye("Nikola");

    val delegasi = Delegasi(base);
    delegasi.sayHello("Ronaldo");
    delegasi.sayGoodBye("Ribery");


    val delegateOverride = DelegateOverride(base);
    delegateOverride.sayHello("Optimus");
    delegateOverride.sayGoodBye("Megatron");
}