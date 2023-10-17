package lesson4

/** Created by Aandrewkaa **/

fun main() {

    val treningDay = 5
    val flagForDay = (treningDay % 2) == 1

    println("""
        Упражнения для рук:    $flagForDay
        Упражнения для ног:    ${!flagForDay}
        Упражнения для спины:  ${!flagForDay}
        Упражнения для пресса: $flagForDay
    """.trimIndent())
}