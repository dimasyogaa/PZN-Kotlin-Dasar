package _27_Function_Infix_Notation

fun Int.kurangi(newValue: Int): Int {
    return this - newValue
}

infix fun Int.tambah(newValue: Int): Int {
    return this + newValue
}

fun main() {
    val hasil = 10.kurangi(4)
    val hasil2 = 5 tambah 5
    val hasil3 = 5.tambah(5)

    println(hasil)
    println(hasil2)
    println(hasil3)
}

/**
 * Penjelasan kode
 *
 * Ada dua function yang ditambahkan pada tipe data Int yaitu kurangi dan tambah maka setiap tipe data Int bisa menggunakan kedua fungsi tersebut. Misalkan pada variabel hasil karena 10 itu adalah tipe data Int maka bisa langsung di eksekusi fungsinya jadi 10.kurangi(4)
 *
 * Penulisannya bisa dipersingkat menggunakan keyword Infix sebelum keyword fun. Misalkan pada method tambah, karena method ini adalah sebuah Infix maka pemanggilannya bisa dipersingkat menjadi 5 tambah 5 (notasi infix)
 *
 * https://dev.to/alfianandinugraha/mari-mengenal-infix-notation-di-kotlin-1jb6
 */