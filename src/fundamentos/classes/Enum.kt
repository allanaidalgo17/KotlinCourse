package fundamentos.classes

enum class WeekDay(val id: Int, val day: String, val business: Boolean) {
    SUNDAY(1, "Sunday", false),
    MONDAY(2, "Monday", true),
    TUESDAY(3, "Tuesday", true),
    WEDNESDAY(4, "Wednesday", true),
    THURSDAY(5, "Thursday", true),
    FRIDAY(6, "Friday", true),
    SATURDAY(7, "Saturday", false)
}

fun main() {
    println("The first day of the week is ${WeekDay.SUNDAY}")
    for (day in WeekDay.values()) {
        println("${day.day} is a ${if (day.business) "business day" else "weekend day"}.")
    }
}