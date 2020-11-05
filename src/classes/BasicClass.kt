package fundamentos.classes

class Client {
    var name: String = ""
}

fun main() {
    val client = Client()
    client.name = "Name"
    println("The client is ${client.name}")
}