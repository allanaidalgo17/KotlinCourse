package fundamentos.controle

fun main() {
    val num = 10

    when(num) {
        10, 9, 8 -> println("between 8 and 10")
        in 5..7 -> println("between 5 and 7")
        else -> println("another number")
    }
}