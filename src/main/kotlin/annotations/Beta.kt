package annotations

@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented()

annotation class Beta();

class ExampleTarget(
    // Defaultnya @Beta dimasukkan kedlm constructor
    @Beta val firstName: String,
    @Beta val middleName: String,
    @Beta val lastName: String
)

// Misal kita akan buat annotation tidak di constructor tapi di member lain
class ExampleTargetNew(
    @field:Beta val firstName: String, // target mengarah ke field
    @get:Beta val middleName: String, // target mengarah ke fun getter
    @param:Beta val lastName: String // target mengarah ke param
)
