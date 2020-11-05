package fundamentos.classes

class Person1(var name: String)
class Person2(val name: String)
class Person3(initialName: String) {
    val name: String = initialName
}

fun main() {
    val p1 = Person1(name = "p1")
    p1.name = "p11"
    println("The name is ${p1.name}.")

    val p2 = Person2("p2")
    val p3 = Person3("p3")
    println("Names: ${p2.name} and ${p3.name}")
}