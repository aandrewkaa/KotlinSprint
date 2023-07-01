package lesson4


/** Created by Aandrewkaa **/

fun main() {
    val sunWeather = true
    val tentCondition = true
    val humidity = 20
    val seasonWinter = true
    val result = (sunWeather == true) && (tentCondition == true) &&
            (humidity == 20) && (seasonWinter == false)

    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}