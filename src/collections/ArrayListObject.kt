package fundamentos.collections

data class Fruit(var name: String, var price: Double)

fun main() {
    val fruits = arrayListOf(
            Fruit("Banana", 1.50),
            Fruit("Lemon", 2.30),
            Fruit("Peach", 2.30)
    )

    fruits.forEach {fruit -> println("${fruit.name} - $${fruit.price}")}

    println(fruits.contains(Fruit("Banana", 1.50)))
    println(fruits.distinctBy { it.price })
    fruits.add(Fruit("Strawberry", 5.50))
}