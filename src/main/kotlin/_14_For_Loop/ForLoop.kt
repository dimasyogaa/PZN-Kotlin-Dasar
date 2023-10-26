package _14_For_Loop

fun main() {

    // for untuk perulangan data iterator (array, range, dan lain lain)

    var array = arrayOf("Yoga", "Dimas", "Pambudi", "Joko", "Budi", "Rudi")

    var total = 0
    for (name in array) {
        println(name)
        total++
    }
    println("Total perulangan = $total \n")

    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray) {
        println("Index $i = ${array.get(i)}")
    }

}