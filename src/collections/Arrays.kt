package fundamentos.collections

fun main() {
    val nums = Array<Int>(10) {i -> i * 10}

    nums.forEach { num -> println(num) }

    println(nums.size)
    println(nums.get(0))
    nums.set(0, 100)
    println(nums.get(0))
    println(nums[0])
}