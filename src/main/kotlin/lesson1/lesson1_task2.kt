package lesson1

/** Created by Aandrewkaa **/

fun main() {
    var numberOfOrders: UShort = 75U //var т.к. количество заказов меняется
    var numbersOfStuff: UShort = 2000U

    val gratitude_for_purchase: String = "Thank you for purchase!" //val т.к. слова благодарности не меняются

    println(numberOfOrders)
    println(gratitude_for_purchase)
//    println(numbers_of_stuff)
    numbersOfStuff = 1999U
    println(numbersOfStuff)
}

