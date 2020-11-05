package fundamentos.lambdas

data class Class(val name: String, val id: Int)

fun main() {
    val classes = arrayListOf(
            Class("class3", 3),
            Class("class4", 4),
            Class("class1", 1),
            Class("class2", 2)
    )

    val greater = classes.filter { it.id > 2 }.sortedBy { it.name }

    println(greater)
}