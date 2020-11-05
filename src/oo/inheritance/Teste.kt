package fundamentos.oo.inheritance

fun main() {
    val car = Ferrari()
    car.accelerate()
    println(car)

    car.turnOnBoost()
    car.accelerate()
    println(car)
}