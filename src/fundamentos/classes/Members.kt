package fundamentos.classes

class Date(var day: Int, var month: Int, var year: Int) {
    fun formatter(): String {
        return "$day/$month/$year"
    }
}

fun main() {
    val date: Date = Date(17, 11, 1994)

    with(date) {println("$day/$month/$year")}

    date.year = 2020

    println(date.formatter())
}