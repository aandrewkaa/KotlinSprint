package lesson3

/** Created by Aandrewkaa **/

fun main() {
    val userName = "Андрей"
    val greetingsMorning = "Доброе утро"
    val greetingsEvening = "Добрый вечер"

    var greetingsUser = "$greetingsMorning, $userName!"
    println(greetingsUser)

    greetingsUser = "$greetingsEvening, $userName!"
    println(greetingsUser)
}