package fundamentos.classes

class Product(var name: String, var price: Double, var discount: Double, var active: Boolean) {
    val inactive: Boolean get() = !active
    val priceWithDiscount: Double get() = price * (1 - discount)
}

fun main() {
    val p1 = Product("Product1", 100.0, 0.10, false)
    println("${p1.name}\n\tFrom: ${p1.price}\n\tTo: ${p1.priceWithDiscount}")

    if(p1.inactive) {
        p1.price = 0.0
        println("Price inactive: ${p1.priceWithDiscount}")
    }
}