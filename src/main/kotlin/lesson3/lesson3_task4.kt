package lesson3

/** Created by Aandrewkaa **/

fun main() {
    var stepStart = "E2"
    var stepEnd = "E4"
    var stepNumber = 1

    fun toServer (): String = "[$stepStart-$stepEnd;$stepNumber]"

    println(toServer())

    stepStart = "D2"
    stepEnd = "D3"
    stepNumber = 2

    println(toServer())
}