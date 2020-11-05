package fundamentos.collections

fun main() {
    val even = arrayListOf(2, 4, 6)
    val odd = intArrayOf(1, 3, 5)

    val strings = arrayListOf("string", "ss", "sss")

    val union = even + strings

    for (num in odd.union(even).sorted()) {
        println(num)
    }

    println("union = $union")
}