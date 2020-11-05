package fundamentos

fun castAndPrint(x: Any) {
    when(x as? Int) {
        in 0..2 -> println("0..2")
        in 3..5 -> println("3..5")
        else -> println("invalid number")
    }

}

fun main() {
    val nums = arrayOf(1.1, 2.2, 3.3, 4.4)

    for (num in nums) {
        castAndPrint(num)
    }

    for (num in nums) {
        castAndPrint(num.toInt())
    }

}