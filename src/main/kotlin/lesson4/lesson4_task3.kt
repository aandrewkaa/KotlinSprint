package lesson4


/** Created by Aandrewkaa **/

fun main() {
    val sunWeather = true
    val tentCondition = true
    val humidity = 20
    val seasonWinter = true

    println("Благоприятные ли условия сейчас для роста бобовых? ${(sunWeather == true) && (tentCondition == true) && (humidity == 20) && (seasonWinter == false)}")

}