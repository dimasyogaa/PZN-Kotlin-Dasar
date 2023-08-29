package _7_tipe_data_array

fun main() {

    val names: Array<String> = arrayOf("Yoga", "Joko", "Budi")

    println(names.size) // jumlah array = 3

    // mendapatkan value
    println(names.get(1)) // Joko

    println(names[2]) // Budi

    // ubah value
    names.set(1, "Dimas")

    println(names[1]) // Dimas

    names[2] = "Pambudi"
    println(names[2]) // Pambudi

    println("")

    // nullable
    val members: Array<String?> = arrayOfNulls(5)
    println(members[0])
    members[0] = "Yoga"
    members[1] = "Dimas"
    members[2] = "Pambudi"
    println(members[0])

    // tidak ada operasi yang digunakan untuk menghapus elemen Array



}