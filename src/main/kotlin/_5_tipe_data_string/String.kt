package _5_tipe_data_string

fun main() {

    var firstName: String = "Yoga"
    var lastName: String = "Dimas"

    var address: String = """
        |Jalan belum jadi, RT 01 RW 01
        |Kabupaten Subang
        |Jawa Barat
        |Indonesia
    """.trimMargin() // default mencari karakter pipe | lalu menghapus karakter itu dan sebelumnya

    var address2: String = """
        >Jalan belum jadi, RT 01 RW 01
        >Kabupaten Subang
        >Jawa Barat
        >Indonesia
    """.trimMargin(">") // custom



    // lebih efektif
    var address3: String = """
        Jalan belum jadi, RT 01 RW 01
        Kabupaten Subang
        Jawa Barat
        Indonesia
    """.trimIndent()

    println(firstName)
    println(lastName)

    println("")
    println(address)
    println("")
    println(address2)
    println("")
    println(address3)

    println("")

    // concat
    var fullName: String = firstName + " " + lastName
    println(fullName)

    // String Template - direkomendasikan
    fullName = "$firstName $lastName"
    var desc: String = "total $fullName char = ${fullName.length}"

    println(fullName)
    println(desc)

}