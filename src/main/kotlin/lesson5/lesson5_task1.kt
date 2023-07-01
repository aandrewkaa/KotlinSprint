package lesson5

import java.util.*

/** Created by Aandrewkaa **/

fun main() {
    val numberFirst = 4
    val numberSecond = 5
    val scanner = Scanner(System.`in`)

    print("Для входу в систему, введите в консоль сумму чисел $numberFirst + $numberSecond: ")
    val numberRight = scanner.nextInt()
    if (numberRight == (numberFirst + numberSecond)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}