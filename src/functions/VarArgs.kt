package fundamentos.functions

fun sort(vararg nums: Int): IntArray {
    return nums.sortedArray()
}

fun main() {
    for (n in sort(1, 2, 10, 7, 5, 14, 17, 11)) {
        print("$n ")
    }
}