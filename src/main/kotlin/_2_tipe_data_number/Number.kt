package _2_tipe_data_number

fun main() {

    var b: Byte = 127
    var age: Int = 300
    var sample: Float = 10.10F
    var d: Double = 10.10
    var time: Long = 1000L


    println(age)
    println(sample)

    // Literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001

    var binary: Int = 0b010101010
    println(binary)

    // underscore in number - biar mudah bacanya
    var price: Long = 9000_000_000
    println(price)

    // Conversion
    var number: Int = 100
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

    var priceInt: Int = price.toInt()

    println(priceInt) // 410065408, integer/number overflow karena batas maksimum int lebih sedkit dibanding long ,jadi integer setelah sampai batas maksimum maka akan mereset kembali ke batas minimum

    var doubleBinary:Double = binary.toDouble()

    println(doubleBinary)


}