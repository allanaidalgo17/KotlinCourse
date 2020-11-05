package fundamentos.advanced

class Box<T>(val obj: T) {
    private val objs = ArrayList<T>()

    init {
        add(obj)
    }

    fun add(newObj: T) {
        objs.add(newObj)
    }

    override fun toString(): String {
        return objs.toString()
    }
}

fun main() {
    val strings = Box("s1")
    strings.add("s2")
    strings.add("s3")
    println(strings)

    val numbers = Box(1)
    numbers.add(2)
    numbers.add(3)
    println(numbers)
}
