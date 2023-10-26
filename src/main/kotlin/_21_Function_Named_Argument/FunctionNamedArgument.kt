package _21_Function_Named_Argument
// semua parameter harus menggunakan named argument
fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Yoga", "Dimas", "Pambudi")
    fullName(
        lastName = "Pambudi",
        firstName = "Yoga",
        middleName = "Dimas"
    )
}