package fundamentos.functions

class Product(val name: String, val price: Double)

infix fun Product.moreExpensiveThan(product: Product): Boolean = this.price > product.price

fun main() {
    val p1 = Product("name1", 100.0)
    val p2 = Product("name2", 200.0)
    println(p1 moreExpensiveThan p2)
}