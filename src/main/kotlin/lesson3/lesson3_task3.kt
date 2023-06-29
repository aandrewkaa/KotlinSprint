package lesson3

/**
 * Пишем программу, которая будет помогать учить таблицу умножения.
 * В отдельную переменную будет записываться число (объявить и проинициализировать),
 * а выводиться будет таблица умножения для этого числа. Таблица должна корректно печататься,
 * если в исходную переменную подставлять разные числа.

Пример вывода:
6 x 1 = 6
6 x 2 = 12
…
6 x 9 = 54

– Вместо числа 6 использовать данные из объявленной переменной;
– Вычислять значения прямо в строке;
– Вывод всей таблицы нужно сделать в одной функции println(), которая вызывается один раз.
 */

/** Created by Aandrewkaa **/

fun main() {
    val numberForTable = 9

    println(""" 
        $numberForTable X 1 = ${numberForTable * 1}
        $numberForTable X 2 = ${numberForTable * 2}
        $numberForTable X 3 = ${numberForTable * 3}
        $numberForTable X 4 = ${numberForTable * 4}
        $numberForTable X 5 = ${numberForTable * 5}
        $numberForTable X 6 = ${numberForTable * 6}
        $numberForTable X 7 = ${numberForTable * 7}
        $numberForTable X 8 = ${numberForTable * 8}
        $numberForTable X 9 = ${numberForTable * 9}
    """.trimIndent())
}