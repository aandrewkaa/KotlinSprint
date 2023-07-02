package lesson5

import kotlin.random.Random


/** Created by Aandrewkaa **/

fun main() {
    val numberFirst = Random.nextInt(0, 100)
    val numberSecond = Random.nextInt(0, 100)

    println("Введите два числа 1 до 100")
    val numberFirstEntered = readln().toInt()
    val numberSecondEntered = readln().toInt()

    if ((numberFirst == numberFirstEntered) && (numberSecond == numberSecondEntered)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((numberFirst == numberFirstEntered) || (numberSecond == numberSecondEntered)) {
        println("Вы выиграли утешительный приз! Были загаданы числа $numberFirst и $numberSecond")
    } else {
        println("Неудача! Крутите барабан! Были загаданы числа $numberFirst и $numberSecond")
    }
}