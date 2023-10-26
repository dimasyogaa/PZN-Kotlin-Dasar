package _26_Extension_Function

/** Teori Extension Function
 * kemampuan menambahkan function pada tipe data yang sudah ada
 * jika ada library yang tipe data nya tidak bisa di modifikasi, maka bisa tambahkan function dengan extension function
 * termasuk metaprogramming
 * membuat : tipedata.namafunction()
 * mengakses data di extension function : this
 */

fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Halo $this")

fun main() {
    val name = "Dimas"

    println(name.hello())

    name.printHello()

    "Kurniawan".printHello()
}