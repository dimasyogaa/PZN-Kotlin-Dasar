package _35_Closure

/** Closure
 * kemampuan sebuah function, lambda atau anonymous function
 * berinteraksi dengan data-data disekitarnya dalam scope yang sama
 * Hati hati dalam penggunaan closure karena bisa berbahaya ketika
 * mengakses variabel yang seharusnya tidak diinginkan untuk diakses
 */

fun main() {

    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Function increment")
        counter++
    }

    fun functionIncrement(){
        println("Function increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)

}