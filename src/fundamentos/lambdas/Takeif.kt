package fundamentos.lambdas

fun main() {
    print("Type your message: ")
    val input = readLine()
    val message = input.takeIf { it?.trim() != "" } ?: "No message"

    println(message)
}