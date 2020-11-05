package fundamentos.functions

fun fullName(firstName: String, surname: String): String {
    return "$firstName $surname"
}

fun main() {
    println(fullName("Name", "Surname"))
    println(fullName(firstName = "Name", surname = "Surname"))
    println(fullName(surname = "Surname", firstName = "Name"))
}