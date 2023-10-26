package _20_Function_Default_Argument

fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Yoga")
    hello("Yoga", "Dimas")
    hello("Pambudi")
    hello("Joko", "Nugroho")
}