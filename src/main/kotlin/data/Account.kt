package data

import kotlin.properties.Delegates

class Account(description: String = "") {
    // lazy adalah nama object delegasi
    // lazy adl object
    val name: String by lazy {
        println("Name is called")
        "Kevin" // kembalian (return) harus sesuai dengan tipe data
    }

    var description: String by Delegates.observable(description) { property, oldValue, newValue ->
            println("${property.name} changed from $oldValue to $newValue");
    }
}