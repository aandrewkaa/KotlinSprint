package lesson4

/** Created by Aandrewkaa **/

fun main() {

    val treningDay = 5

    println("""
        Упражнения для рук:    ${(treningDay % 2) == 1}
        Упражнения для ног:    ${(treningDay % 2) == 0}
        Упражнения для спины:  ${(treningDay % 2) == 0}
        Упражнения для пресса: ${(treningDay % 2) == 1}
    """.trimIndent())
}