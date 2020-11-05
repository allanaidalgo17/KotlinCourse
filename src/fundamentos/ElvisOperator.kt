package fundamentos

fun main() {
    val optional: String? = null
    val notOptional: String = optional ?: "Standard value"

    println(notOptional)
}