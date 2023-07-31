package app

import data.SuperTeacher
import data.Teacher

fun main() {
    /*
    Visibility Modifiers
    - Class, Interface, Constructor, Function, dan Properties (termasuk Getter dan Setter) bisa memiliki Visibility Modifiers di Kotlin
    - Ada 4 visibility modifiers di kotlin, yaitu: public, private, protected, internal
    - Secara standar visibility modifiers di kotlin adalah public

    Perbedaan tiap Visibility Modifiers
    - public -> Jika tdk menyebutkan, maka scr otomatis visibility modifiers nya adl public, yg artinya bisa diakses dari manapun
    - private -> Artinya hanya bisa diakses di tempat deklarasinya
    - protected -> Artinya hanya bisa diakses di tempat deklarasi, dan juga turunannya
    - internal -> artinya hanya bisa diakses di module/project yang sama.
     */

    val teacher = Teacher("Leinto");
    println(teacher.name);
//    teacher.teach() // error krn functionnya private

    val superTeacher = SuperTeacher("Kevin");
    println(superTeacher.name);
    superTeacher.test();
}