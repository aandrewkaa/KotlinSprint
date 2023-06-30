package lesson3

/** Created by Aandrewkaa **/

fun main() {

    val fromServer = "D2-D4;0"

    val list = fromServer.split("-", ";")
    val stepStart = list[0]
    val stepEnd = list[1]
    val stepNumber = list[2]

    println("$stepStart - откуда идем")
    println("$stepEnd - куда идем")
    println("$stepNumber - номер хода")
}