package fundamentos

fun main() {
    val names = listOf("name1", "name2", "name3")
    println("The first name is ${names[0]}.")

    val mood: Boolean = true
    println("Today I'm ${if (mood) "Happy!" else "Sad =("}")
}