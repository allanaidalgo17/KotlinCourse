package fundamentos.functions

fun printGreater(a: Int, b: Int) {
    println(Math.max(a, b))
}

fun printGreater2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}

fun printGreater3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}

fun printGreater4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

fun printGreater5(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}

fun main() {
    printGreater(1, 2)
    printGreater2(1, 2)
    printGreater3(1, 2)
    printGreater4(1, 2)
    printGreater5(1, 2).run { 2 > 1 }.run { println("Result = $this") }
}