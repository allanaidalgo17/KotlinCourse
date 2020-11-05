package fundamentos.classes

class Calculator {
    private var result: Int = 0

    fun sum(vararg values: Int): Calculator {
        values.forEach { result += it }
        return this
    }

    fun multiply(value: Int): Calculator {
        result *= value
        return this
    }

    fun clear(): Calculator {
        result = 0
        return this
    }

    fun print(): Calculator {
        println(result)
        return this
    }

    fun getResult(): Int {
        return result
    }

}

fun main() {
    val calculator = Calculator()
    calculator.sum(1, 2, 3).multiply(3).print()
    calculator.sum(7, 10).print().clear()

    println(calculator.getResult())
}