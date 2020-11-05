package fundamentos.controle

fun main() {
    val num1: Int = 8
    val num2: Int = 4

    if (num1 in 8..10) {
        println("between 8 and 10")
    } else if (num1 in 5..7) {
        println("between 5 and 7")
    } else {
        println("another number")
    }

    val max = if (num1 > num2) {
        println("Inside if")
        num1
    } else {
        println("Inside else")
        num2
    }

    println("The maximum value is $max")

    val min = if (num1 < num2) num1 else num2

    println("The minimum value is $min")
}