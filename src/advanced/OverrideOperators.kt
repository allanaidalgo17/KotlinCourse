package fundamentos.advanced

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)
    operator fun minus(other: Point): Point = Point(x - other.x, y - other.y)
    operator fun unaryMinus(): Point = Point(-x, -y)
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(10, 20)

    println(-p1)
    println(p1 + p2)
    println(p1 - p2)
}