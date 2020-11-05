package fundamentos.lambdas

data class House(var address: String = "", var num: Int = 0)

fun main() {
    val house = House()

    house.run {
        address = "Street ABC"
        num = 1
    }

    println(house)
}