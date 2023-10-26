package _25_Function_Varargs_Parameter


// Varargs : variabel arguments
// - artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array
// - varargs harus diletakan paling terakhir pada parameter
fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    print("$name ")
    return total
}

fun main() {
    // val values = arrayOf(10,10,10,10)
    val result = hitungTotal("Dimas", 10, 10, 10)

    println(result)
}