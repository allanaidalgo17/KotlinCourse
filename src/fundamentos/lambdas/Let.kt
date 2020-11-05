package fundamentos.lambdas

fun main() {
    val listWithNulls: List<String?> = listOf("String1", null, "String2", null, "String3", null)

    for (item in listWithNulls) {
        item?.let {
            println(it)
        }
    }
}