package _27_Function_Infix_Notation

/** Teori
 * Infix merupakan notasi antara operand dan operator (+, -, *, /)
 * dimana operator berada di antara dua operand.
 * Bentuk Infix pada matematika :
 *
 * 2 + 3 = 5
 * 5 + 5 = 10
 *
 * Misalkan pada 2 + 3, 2 dan 3 merupakan operand dan + merupakan operator.
 *
 * Syarat Function Infix Notation
 * - Harus sebagai function member (akan dibahas di OOP) atau harus dibuat sebagai function extension
 * - Harus memiliki 1 parameter
 * - Parameter tidak boleh varargs dan tidak boleh memiliki nilai default
 */

infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}

fun main() {
    val result = "Yoga Dimas" to "LO"
    println(result)
}
