package fundamentos.classes

class NormalClass(val att1: String, val att2: Int)

data class DataClass(val att11: String, val att22: Int)

fun main() {
    val nc1 = NormalClass("string", 320)
    val nc2 = NormalClass("string", 320)

    println(nc1 == nc2)

    val dc1 = DataClass("string1", 32)
    val dc2 = DataClass("string1", 32)

    println(dc1 == dc2) //equals
    println(dc1 === dc2)
    println(dc1.toString())
    println(dc1.copy())
    println(dc1.copy(att22 = 42))

    // destructuring -> data class
    val (att11, att22) = dc1
    println("$att11 $att22")
}