package lesson1

/** Created by Aandrewkaa **/

fun main() {
    var number_of_orders: UShort = 75U //var т.к. количество заказов меняется
    var numbers_of_stuff: UShort = 2000U

    val gratitude_for_purchase: String = "Thank you for purchase!" //val т.к. слова благодарности не меняются

    println(number_of_orders)
    println(gratitude_for_purchase)
//    println(numbers_of_stuff)
    numbers_of_stuff = 1999U
    println(numbers_of_stuff)
}

