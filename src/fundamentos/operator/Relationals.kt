package fundamentos.operator

import java.util.*

fun main() {
    println("String" === "String")
    println(3 !== 2)
    println(3 != 2)

    val date1 = Date(0)
    val date2 = Date(0)

    //referential equality
    println("result = ${date1 === date2}")

    //structural equality
    println("result = ${date1 == date2}")
    println("result = ${date1.equals(date2)}")
}