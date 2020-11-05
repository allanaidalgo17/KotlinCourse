package fundamentos.functions

inline fun transaction(function: () -> Unit) {
    println("Opening transaction...")

    try {
        function()
    } finally {
        println("Closing transaction...")
    }
}

fun <T> executeWithLogs(functionName: String, function: () -> T): T {
    println("Executing $functionName...")
    try {
        return function()
    } finally {
        println("Execution completed.")
    }
}

fun sum2(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    transaction {
        println("Executing...")
    }

    val result = executeWithLogs("sum2") {
        sum2(2, 3)
    }

    println(result)
}