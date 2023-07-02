package lesson5

/** Created by Aandrewkaa **/

fun main() {
    val numberFirst = 4
    val numberSecond = 5

    print("Для входу в систему, введите в консоль сумму чисел $numberFirst + $numberSecond: ")
    val numberRight = readln().toInt()
    if (numberRight == (numberFirst + numberSecond)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}