package _39_Main_Parameters

/** Main Parameter
 * Kadang saat menjalankan program, kita butuh input parameter dari luar
 * Bisa untuk konfigurasi program, ataupun yang lainnya
 * Kotlin mendukung parameter untuk main function
 *
 */

fun main(args: Array<String>) {
    for (value in args) {
        println(value)
    }
}

// edit configuration -> MainParameters.kt -> program arguments -> yoga dimas pambudi-> ok/run -> run
// "yoga dimas" "dimas" "dimas pambudi"
// -java -version