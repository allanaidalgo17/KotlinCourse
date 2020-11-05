package fundamentos.functions

class Operations {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun calc(a: Int, b: Int, function: (Int, Int) -> Int): Int {
    return function(a, b)
}

fun main() {
    println(calc(2, 3, Operations()::sum))
    println(calc(2, 3, ::sum))
}