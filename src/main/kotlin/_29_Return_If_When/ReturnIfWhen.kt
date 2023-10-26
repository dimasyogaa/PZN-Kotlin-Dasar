package _29_Return_If_When



fun main() {

    fun sayHello(name: String = ""): String {
        return when(name){
            "" -> "Hello Bro!"
            else -> "Hello $name"
        }
    }

    fun sayHello2(name: String = ""): String {
        return if (name == "") {
            "Hello Bro!"
        } else {
            "Hello $name"
        }
    }


    println(sayHello())
    println(sayHello("Yoga"))

    println()

    println(sayHello2())
    println(sayHello2("Dimas"))

}