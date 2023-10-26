package _37_Label

/** Label
 * Label adalah penanda
 * Semua expression di Kotlin bisa ditandai dengan label
 * Untuk membuat label di Kotlin, cukup menggunakan nama label lalu diikuti dengan karakter @
 * nama label tidak boleh ada spasi
 *
 *
 * Salah satu kegunaan label adalah, bisa diintegrasikan dengan break, continue dan return
 * Biasanya break, continue dan return hanya bisa menghentikan proses di blok kode tempat mereka berada, namun dengan menggunakan label, kita bisa menentukan ke label mana kode akan berhenti
 *
 */

fun labelBreak() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i > 5) {
                break@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun labelContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun labelReturn(){
    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("") test@{
        if (it == "") {
            // return bisa di lambda karena ada label
            return@test
        } else {
            println("Eko")
        }
    }
}

fun main() {

    // labelBreak()
    // labelContinue()
    labelReturn()



}

