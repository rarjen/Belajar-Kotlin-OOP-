package annotations


@Target(AnnotationTarget.CLASS) // cuma bisa ditambahkan di class
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy(val author: String);
