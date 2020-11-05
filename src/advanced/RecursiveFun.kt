package fundamentos.advanced

fun pow(base: Int, exp: Int, total: Int): Int {

    return if(exp <= 0) {
        total
    } else {
        pow(base, exp - 1, total * base)
    }
}

fun factorial(num: Int): Int {
    return if(num <= 1) 1 else num * factorial(num - 1)
}

fun main() {
    println(pow(2, 4, 1))
    println(pow(2, 10, 1))

    println(factorial(5))
}