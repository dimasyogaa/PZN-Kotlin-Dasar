package _8_tipe_data_range

fun main() {

    // val range = 1..100

    // Range Terbalik - downTo
    // val range = 100 downTo 1

    // Range dengan Step
    val range = 100 downTo 1 step 2


    // mendapatkan total data di range
    println(range.count())

    // mengecek apakah terdapat value tersebut
    println(range.contains(3))
    println(range.contains(50))
    println(range.contains(101))

    // mendapatkan nilai pertama
    println(range.first())

    // mendapatkan nilai terakhir
    println(range.last())

    // mendapatkan nilai tiap kenaikan
    println(range.step)





}