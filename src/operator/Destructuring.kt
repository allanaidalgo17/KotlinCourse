package fundamentos.operator

data class Car(val brand: String, val type: String)

fun main() {
    val (brand, type) = Car("Brand", "Type")
    println("$brand $type")

    val (num1, num2) = listOf(1, 2)
    println("$num1 $num2")

    val (_, _, num) = listOf(1, 2, 3)
    println(num)
}