package _36_Inline_Function

/** Inline Functions
 * Menggunakan Higher-Order Function adalah salah satu fitur yang sangat berguna.
 * Namun penggunaan Higher-Order Function akan berdampak terhadap performa saat aplikasi berjalan,
 * karena harus membuat object lambda berulang-ulang.
 * Jika penggunaannya tidak terlalu banyak mungkin tidak akan terasa, tapi jika banyak sekali, maka akan terasa impact nya
 *
 * Inline Functions adalah kemampuan di Kotlin yang mengubah Higher-Order Function menjadi Inline Function
 * Dimana dengan Inline Function, code di dalam Higher-Order Function akan di duplicate agar pada saat runtime,
 * aplikasi tidak perlu membuat object lambda berulang-ulang
 *
 * keyword inline
 * meskipun java bytecodenya lebih besar dengan inline, tapi
 * secara performa lebih cepat dengan inline
 * karena tidak membuat objek baru
 *
 *
 * secara default, keyword inline akan menjadikan semua parameter menjadi inline
 * NoInline : tidak menjadikan inline, artinya tetep membuat objek terus
 */

inline fun hello(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {

    noInline()

    println()

    inline()

    println()


    for (i in 0..100) {
        println(hello({ "Yoga" }, { "Dimas" }))
    }

}

fun noInline() {
    fun helloNoInline(firstName: () -> String): String {
        return "Hello ${firstName()}"
    }
    for (i in 0..100) {
        println(helloNoInline { "Yoga" })
    }
    println(helloNoInline { "Dimas" })
    println(helloNoInline { "Pambudi" })
}

inline fun helloInline(firstName: () -> String): String {
    return "Hello ${firstName()}"
}

fun inline() {

    for (i in 0..100) {
        println(helloInline { "Yoga" })
    }
    println(helloInline { "Dimas" })
    println(helloInline { "Pambudi" })

}

// lihat bytecode kotlin : Tools -> Kotlin -> Show Kotlin Bytecode -> Decompile(Java Code)

/**
 * (Function0)null.INSTANCE : artinya membuat objek baru, bukan inline
 */