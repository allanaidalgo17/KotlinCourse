package fundamentos.classes

class Calculator2 {
    var result = 0

    fun sum(a: Int, b: Int) {
        result += a + b
    }

    fun add(a: Int) {
        result += a
    }
}

fun main() {
    val calculator = Calculator2()
    calculator.apply { sum(1, 3) }.apply { add(4) }.apply { println(result) }

    calculator.apply {
        sum(1,3)
        add(4)
        println(result)
    }
}