package lesson4


/** Created by Aandrewkaa **/

fun main() {

    var cargoWeight = 20
    var cargoVolume = 80

    println("Average для груза с весом $cargoWeight кг и объемом $cargoVolume л: " +
            "${(cargoWeight <= WEIGHT_MAX) && (cargoWeight >= WEIGHT_MIN) && 
                    (cargoVolume < VOLUMEMAX)}")

    cargoWeight = 50
    cargoVolume = 100

    println("Average для груза с весом $cargoWeight кг и объемом $cargoVolume л: " +
            "${(cargoWeight <= WEIGHT_MAX) && (cargoWeight >= WEIGHT_MIN) && 
                    (cargoVolume < VOLUMEMAX)}")
}

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUMEMAX = 100