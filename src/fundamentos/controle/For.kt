package fundamentos.controle

fun main() {
    for (i in 1..10) {
        println("i = $i")
    }

    for (i in 10 downTo 1) {
        println("i = $i")
    }

    for (i in 0..100 step 5) {
        println("i = $i")
    }

    for (i in 100 downTo 0 step 5) {
        println("i = $i")
    }

    val names = arrayListOf("name1", "name2", "name3")
    for ((index, name) in names.withIndex()) {
        println("${index + 1} - $name")
    }
}