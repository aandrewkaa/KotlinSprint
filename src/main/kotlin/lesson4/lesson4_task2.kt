package lesson4


/** Created by Aandrewkaa **/

fun main() {
    val weightMin = 35
    val weightMax = 100
    val volumeMax = 100

    var cargoWeight = 20
    var cargoVolume = 80

    println("Average для груза с весом $cargoWeight кг и объемом $cargoVolume л: ${(cargoWeight <= weightMax) && (cargoWeight >= weightMin) && (cargoVolume < volumeMax)}")

    cargoWeight = 50
    cargoVolume = 100

    println("Average для груза с весом $cargoWeight кг и объемом $cargoVolume л: ${(cargoWeight <= weightMax) && (cargoWeight >= weightMin) && (cargoVolume < volumeMax)}")
}