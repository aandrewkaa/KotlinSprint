package lesson5

/** Created by Aandrewkaa **/

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