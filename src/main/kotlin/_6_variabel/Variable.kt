package _6_variabel

// Constant biasanya diakses untuk global
// harus menggunakan val, penulisan UPPER_CASE
const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {

    val firstName = "Eko"
    val age = 30

    println(firstName)
    println(age)

    // nullable - tidak direkomendasikan
    var name: String? = null
    // name = "Yoga"

    println(name)
    println(name?.length)

    println("$APPLICATION : $VERSION")

}