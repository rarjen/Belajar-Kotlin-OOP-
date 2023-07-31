package data

sealed class Operation(val name: String); //otomatis menajdi abstract

class Plus() : Operation("Plus");
class Minus() : Operation("Minus");
class Modulo() : Operation("Modulo");