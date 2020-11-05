package fundamentos.functions

fun <E> List<E>.secondOrNull(): E? = if (this.size >= 2) this.get(1) else null

fun main() {
    val list = listOf("name1", "name2", "name3")

    println(list.secondOrNull())
}