package fundamentos.collections

fun main() {
    val map1 = hashMapOf(1 to "name1", 2 to "name2", 3 to "name3")
    val map = HashMap<Long, String>()

    map.put(1, "name1")
    map.put(2, "name2")
    map.put(3, "name3")

    map.put(3, "name33")

    for (pair in map) {
        println(pair)
    }

    for (name in map.values) {
        println(name)
    }

    for (id in map.keys) {
        println(id)
    }

    for ((id, name) in map) {
        println("$id - $name")
    }

    println("${map.size} \n${map.get(1)} \n${map.contains(2)} \n${map.remove(3)}")
    map.clear()
    println(map.isEmpty())
}