package _27_Function_Infix_Notation

class Angka(var angka: Int) {
    infix fun tambah(nilai: Int): Int {
        return angka + nilai
    }
}

fun main() {
    val hasil = Angka(10)
    println(hasil tambah 10)
}