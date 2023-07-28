package data

class Laptop(val name: String) // => : Any()

open class HandPhone(val name: String) // => : Any()

class SmartPhone(name: String, val os: String) : HandPhone(name)