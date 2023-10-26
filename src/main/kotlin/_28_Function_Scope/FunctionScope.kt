package _28_Function_Scope

fun satu(){
    // error
    // contohHelloWorld()
}

fun dua(){
    // error
    // contohHelloWorld()
}

fun main() {

    // inner function
    fun contohHelloWorld(){
        println("Hello World")
    }

    // hanya bisa diakses di dalam function main
    contohHelloWorld()
}