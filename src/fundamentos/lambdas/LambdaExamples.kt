package fundamentos.lambdas

interface Operation {
    fun execute(a: Int, b: Int): Int
}

class Multiply: Operation {
    override fun execute(a: Int, b: Int): Int {
        return a * b;
    }
}

class Calculator {
    fun calculate(a: Int, b: Int): Int {
        return a + b
    }

    fun calculate(a: Int, b: Int, operation: Operation): Int {
        return operation.execute(a, b)
    }

    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
}

fun main() {
    // Example 1
    val sum = {x: Int, y: Int -> x + y}
    println(sum(4, 6))

    // Example 2 -> not using lambda
    val calculator = Calculator()
    val result1 = calculator.calculate(1,2)
    val result2 = calculator.calculate(1, 2, Multiply())
    println("$result1, $result2")

    // Example 3
    val sub = {x: Int, y: Int -> x - y}
    val result3 = calculator.calculate(1,2, sub)
    println(result3)
}