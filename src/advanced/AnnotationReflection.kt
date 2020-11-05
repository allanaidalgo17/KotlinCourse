package fundamentos.advanced

annotation class Positive
annotation class NotEmpty

class Person(id: Int, name: String) {
    @Positive
    var id: Int = id

    @NotEmpty
    var name: String = name
}

// Reflection...
fun getValue(obj: Any, attributeName: String): Any {
    val attribute = obj.javaClass.getDeclaredField(attributeName)
    val isAccessible = attribute.isAccessible

    attribute.isAccessible = true
    val value = attribute.get(obj)
    attribute.isAccessible = isAccessible

    return value
}

fun validate(obj: Any): List<String> {
    val msgs = ArrayList<String>()
    obj::class.members.forEach { member ->
        member.annotations.forEach { annotation ->
            val value = getValue(obj, member.name)
            when(annotation) {
                is Positive ->
                    if(value !is Int || value <= 0) {
                        msgs.add("The value '$value' is not a positive number.")
                    }
                is NotEmpty ->
                    if(value !is String || value.trim().isEmpty()) {
                        msgs.add("The value '$value' is not valid.")
                    }
            }
        }
    }

    return msgs
}

fun main() {
    val p1 = Person(1, "name1")
    println(validate(p1))

    val p2 = Person(-1, "")
    println(validate(p2))
}