package fundamentos

fun smart(x: Any) {
    if (x is String) {
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}

fun smart2(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("another type")
    }
}

fun main() {
    val value = "string"

    if (value is String) {
        println(true)
    }

    if (value !is String) {
        println(false)
    }

    //Smart Cast
    smart("Hello")
    smart(1)
    smart2("Hello")
    smart2(1)
    smart2(1.9)
}