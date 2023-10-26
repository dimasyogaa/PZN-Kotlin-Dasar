package _34_Anonymous_Function

/** Anonymous Function
 * Lambda akan menganggap baris terakhir di blok lambda sebagai hasil kembalian
 * Kadang kita butuh membuat lambda yang se flexible function, yang mana kita bisa mengembalikan hasil dimanapun
 * Untuk hal ini, kita bisa menggunakan Anonymous Function
 * Anonymous Function sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit berbeda
 * masih menggunakan kata kunci fun
 * lambda digunakan untuk kasus sederhana, tidak bisa return if when, kata kunci return tidak disupport di lambda
 * anonymous function digunakan untuk kasus yang kompleks
 */

fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // 1
    val upper = fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.uppercase()
        }
    }

    println(hello("Yoga", upper))
    println(hello("", upper))

    println()

    // 2
    println(hello("Dimas", fun(value: String): String {
        return value.lowercase()
    }))

    println()

    // 3
    val result1 = hello("Pambudi", fun(value: String): String {
        if (value.isBlank()) {
            return "Ups!"
        }
        return value.uppercase()
    })

    println(result1);

}