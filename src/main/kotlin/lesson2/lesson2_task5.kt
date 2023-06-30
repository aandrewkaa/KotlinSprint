package lesson2

import kotlin.math.pow
import kotlin.text.*

/**
Программа-калькулятор для банковского приложения, для расчета суммы вклада через n лет.
 */

/** Created by Aandrewkaa **/

fun main() {
    val sumEntry = 70_000
    val percent = 16.7
    val timeYears = 20

    val sumOut = sumEntry * (1 + percent / 100).pow(timeYears)

    println(String.format("%.3f - сумма вклада через 20 лет с учетом начисленных процентов.", sumOut))

}