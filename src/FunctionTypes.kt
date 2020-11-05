package fundamentos

fun printSum(a: Int, b: Int) {
    println(a + b)
}

fun sum(a: Int, b: Int = 1): Int {
    return a + b
}

fun main() {
    printSum(1, 2)
    println(sum(1, 2))
    println(sum(1))
}