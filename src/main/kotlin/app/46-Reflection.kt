package app

import annotations.NotBlank
import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

// bayangkan bila ada 10 object maka kita akan capek / tidak efisien
//fun validateRequest(request: CreateProductRequest) {
//    if(request.id == "") {
//        throw  ValidationException("Id is blank");
//    } else if(request.name == "") {
//        throw  ValidationException("Name is blank");
//    }
//}
//
//fun validateCategoryRequest(request: CreateCategoryRequest) {
//    if(request.id == "") {
//        throw  ValidationException("Id is blank");
//    } else if(request.name == "") {
//        throw  ValidationException("Name is blank");
//    }
//}

// Ini cara lebih mudah
fun validateRequest(request: Any) { // Dibuat Any agar dapat menerima class apapun
    val clazz = request::class
    val properties = clazz.memberProperties

    // iterate satu-satu, lalu cek kalo ada annotation @NotBlank
    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            // value outputnya harusnya adl string. Namun jangan langsung di konversi ke string krn bisa salah menambahkan anno NotBlank pada tipe data selain string
//            val value: String = property.call(request) as String // ini akan lansung di konversi ke string. Akan error
//            if ("" == value){
//                throw ValidationException("${property.name} is blank")
//            }

            // ada cara validasi lagi seperti ini
            val value = property.call(request)
            when (value) {
                is String -> {
                    if ("" == value) {
                    throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    /*
    Reflection
    - Reflection adalah kemampuan melihat struktur aplikasi kita pada saat berjalan
    - Reflection biasanya sangat berguna saat kita ingin membuat library ataupun framework, sehingga bisa meng-otomatisasi pekerjaan
    - Untuk mengakses reflection class dari sebuah object, kita bisa menggunakan kata kunci ::class, atau bisa langsung dari
      NamaClass::class
     */

    val request = CreateProductRequest("1", "Indomie", 2000L);
    validateRequest(request);

    val request2 = CreateCategoryRequest("F", "Food");
    validateRequest(request2);

}