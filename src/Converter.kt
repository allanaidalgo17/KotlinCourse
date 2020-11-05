package fundamentos

fun main() {
    val a = 1

    //int to string
    println(a.toString())

    //string to int
    println("1.9".toDouble())
    println("String".toIntOrNull())
    println("String".toIntOrNull() ?: 0)
    println("1".toInt())
}