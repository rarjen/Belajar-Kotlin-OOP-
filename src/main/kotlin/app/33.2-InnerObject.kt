package app

import data.Application

fun main() {
    /*
    Inner Object
    - Di Kotlin, singleton object bisa dibuat di dlm sebuah class
    - Namun berbeda dgn inner class, singleton object tidak bisa mengakses properties ata fun yg ada di outer class nya
     */

    println(Application.Utilities.toUpper("verstappen"));
}