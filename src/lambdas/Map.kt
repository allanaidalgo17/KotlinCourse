package fundamentos.lambdas

import fundamentos.functions.sum
import fundamentos.sum

class Product(val name: String, val price: Double)

val products = listOf(
        Product("p1", 100.0),
        Product("p2", 200.0),
        Product("p3", 300.0),
        Product("p4", 400.0),
        Product("p5", 500.0)
)

fun main() {
    val names = arrayListOf("Name 1", "Name 2", "Name 3")
    names.map { it.toUpperCase() }.apply { print(this) }

    val sumPrices = {total: Double, current: Double -> total + current}
    var total = products.map { it.price }.reduce(sumPrices)
    println(total)
}