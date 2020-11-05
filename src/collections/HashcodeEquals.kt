package fundamentos.collections

class Obj(val name: String, val description: String) {
    override fun hashCode(): Int {
        return name.length
    }

    override fun equals(other: Any?): Boolean {
        return if (other is Obj) {
            name.equals(other.name, ignoreCase = true)
        } else {
            false
        }
    }
}

fun main() {
    val set = hashSetOf(
            Obj("name1", "d1"),
            Obj("name11", "d2"),
            Obj("name111", "d3"),
            Obj("name1", "d4")
    )

    println(set.contains(Obj("Name11", "d5")))
}