package _17_Break_Continue

fun main() {

    var i = 0

    // Break : menghentikan seluruh perulangan
    while (true) {
        println("Hello ke $i")
        i++

        if (i > 10) {
            break
        }
    }

    println("");

    // Continue : menghentikan perulangan yang berjalan dan langsung melanjutkan ke perulangan selanjutnya
    for (i in 20..30) {

        if (i % 2 == 0) {
            continue
        }

        println("Angka $i")
    }

}