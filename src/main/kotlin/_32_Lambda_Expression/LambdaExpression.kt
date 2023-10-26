package _32_Lambda_Expression

/** Teori
 * Function di kotlin adalah first-class citizens,
 * artinya dianggap seperti tipe data yang lainnya.
 * bisa disimpan di variabel, array, atau dikirim ke parameter function itu sendiri
 *
 * Lambda expression : function yang tidak memiliki nama
 * tanpa harus mendeskripsikan function
 * secara default : kode baris terakhir dalam blok kode lambda expression akan dijadikan return value-nya
 */


fun main() {

    mainSimple();

    println();

    mainComplex();


}

fun mainSimple() {

    // membuat lambda
    // namaVariabel: (TipeParameter) -> (TipeKembalian) = { namaParameter -> statement/expression }
    val lambdaName: (String) -> String = { value: String ->
        value.uppercase() // return value.uppercase()
    }

    // mengeksekusi lambda
    val name = lambdaName("Dimas");
    print(lambdaName("Yoga "));
    println(name);
}

fun mainComplex() {


    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Yoga", "Dimas")
    println(result)

    // it hanya bisa digunakan ketika hanya memiliki 1 parameter
    // it : representasi parameter pertama
    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Pambudi"))

    println();

    // Method/Function References ::
    fun toUpper(value: String): String = value.uppercase()

    val toUpperCase: (String) -> String = ::toUpper

    println(toUpperCase("Dimas Pambudi"))
}