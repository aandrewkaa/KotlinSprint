package lesson4


/** Created by Aandrewkaa **/

fun main() {
    val ifSunWeather = true
    val ifTentOpen = true
    val humidity = 20
    val ifSeasonWinter = true
    val ifGoodForGrow = (ifSunWeather == true) && (ifTentOpen == true) &&
            (humidity == 20) && (ifSeasonWinter == false)

    println("Благоприятные ли условия сейчас для роста бобовых? $ifGoodForGrow")

}