package _31_Function_Tail_Recursive

fun main() {

    // fun display(value: Int) {
    //     println("Recursive no tailrec $value")
    //     if (value > 0) {
    //         display(value - 1)
    //     }
    // }
    //
    // display(10000) // stackoverflow error

    tailrec fun tailDisplay(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            // tailDisplay(value - 1) * value // tidak boleh ada operasi data lain
            tailDisplay(value - 1)
        }
    }


    // println()
    // tailDisplay(10000)

    println()
    println()

    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> factorialRecursive(value - 1, total * value)
        }
    }

    println(factorialRecursive(3))


}