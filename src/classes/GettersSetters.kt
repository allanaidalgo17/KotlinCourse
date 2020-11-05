package fundamentos.classes

class Client2 {
    constructor(name: String) {
        this.name = name
    }

    var name: String
        get() = "My name is ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "No name"
        }
}

fun main() {
    val c1 = Client2("")
    println(c1.name)
}