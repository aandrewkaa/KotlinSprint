package lesson3

import java.time.Clock
import java.time.LocalTime
import java.time.ZoneId

/** Created by Aandrewkaa **/

fun main() {
    val userName = "Андрей"
    val greetingsMorning = "Доброе утро"
    val greetingsEvening = "Добрый вечер"
    var greetingsUser: String
    val realTime = LocalTime.now(Clock.system(ZoneId.systemDefault())).hour

    if (realTime <= 17) {
        greetingsUser = "$greetingsMorning, $userName!"
    } else {
        greetingsUser = "$greetingsEvening, $userName!"
    }
    println(greetingsUser)

}