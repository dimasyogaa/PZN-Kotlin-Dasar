package _33_Higher_Order_Function

fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // lambda
    val lambdaUpper = { value: String -> value.uppercase() }


    // cara 1
    println(hello("Dimas", lambdaUpper))

    // cara 2
    println(hello("Pambudi", { value: String -> value.lowercase() }))

    println()

    // cara 3 - Trailing Lambda
    print("Trailing Lambda : ")
    println(hello("Pambudi") { value: String -> value.lowercase() })


    // Trailing Lambda : kemampuan lambda ketika parameter lambda berada di posisi terakhir
    // sehingga argument lambda bisa diletakan di luar parenthesis() function
    // hal ini bertujuan agar mudah dibaca dan diliat
    val result1 = hello("Yoga", { value: String -> value.lowercase() })
    val result2 = hello("Yoga") { value: String ->
        value.uppercase()
    }
    print("Trailing Lambda : ")
    println(result2)

}
