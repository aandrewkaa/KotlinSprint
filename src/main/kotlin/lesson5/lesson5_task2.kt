package lesson5

import java.time.Year

/** Created by Aandrewkaa **/

fun main() {
    val userAgeBirth = 2010
    val compraisonResult = (Year.now().value - userAgeBirth) >= AGE_OF_MAJORITY
    println("Результат проверки возраста пользователя: $compraisonResult ")

}

const val AGE_OF_MAJORITY = 18