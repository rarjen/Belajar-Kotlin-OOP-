package app

import data.PersonFunction

fun main() {
    /*
    - Selain Parameters / Fields / Attributes, di dalam Class, kita juga bisa mendeklarasikan Function
    - Function yang kita deklarasikan di dalam Class, secara otomatis menjadi behaviour si object yang dibuat dari class tersebut
     */

    val person1 = PersonFunction();
    person1.firstName = "Otniel";
    person1.middleName = "Kevin";
    person1.lastName = "Abiel";

    person1.sayHello("Leinto");
    person1.run();

    val fullName = person1.getFullName();
    println(fullName);

}