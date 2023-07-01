package lesson5

/**
 * Для алгоритма простого приложения-лотереи, нужно угадать два числа от 1 до 100.
 * Если угадать только одно – игрок получает утешительный приз. Напиши программу, проверяющую выигрыш.

Пользователь должен вводить числа в консоль. Правильные числа заранее известны и хранятся в переменных. Оформить ввод текстовыми аннотациями о том, что нужно вводить. Вывести отдельным сообщением, какие числа были нужны для победы.

– Если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”
– Если угадано только одно число, вывести “Вы выиграли утешительный приз!”
– Если не угадано ничего, вывести “Неудача! Крутите барабан!”
 */

fun main() {
    val numberFirst = 22
    val numberSecond = 72

    println("Введите два числа 1 до 100")
    val numberFirstEntered = readLine()!!.toInt()
    val numberSecondEntered = readLine()!!.toInt()

    if ((numberFirst == numberFirstEntered) && (numberSecond == numberSecondEntered)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((numberFirst == numberFirstEntered) || (numberSecond == numberSecondEntered)) {
        println("Вы выиграли утешительный приз! Были загаданы числа $numberFirst и $numberSecond")
    } else {
        println("Неудача! Крутите барабан! Были загаданы числа $numberFirst и $numberSecond")
    }
}