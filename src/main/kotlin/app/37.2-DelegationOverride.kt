package app

import data.DelegateOverride
import data.MyBase

fun main() {
    /*
    Override Delegation
    - Dalam delegation, properties dan function scr otomatis akan didlegasikan ke object yg dipilih
    - Namun kita ttp bisa meng-override properties dab fun jika kita mau
     */

    val base = MyBase();

    val delegateOverride = DelegateOverride(base);
    delegateOverride.sayHello("Kevin"); //override
    delegateOverride.sayGoodBye("Kevin");
}