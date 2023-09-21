package _11_Operasi_Boolean

fun main() {

    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiEkstra = 80

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusExtra = nilaiEkstra > 75

    // Operasi Boolean
    // &&
    // ||
    // !
    val apakahLulus = apakahLulusAbsen && apakahLulusUjian && apakahLulusExtra
    // val apakahLulus = (apakahLulusAbsen && apakahLulusUjian) && apakahLulusExtra

    println(apakahLulus)

}