package lesson5

import java.util.*

/** Created by Aandrewkaa **/

fun main() {
    val hullDamage: Boolean
    var damageSize: Boolean = false
    val staffSize: Int
    val proviant: Int
    val meteoConditions: Boolean

    val scanner = Scanner(System.`in`)

    print("– есть ли повреждения корпуса? Записывать Boolean переменную: ")
    hullDamage = scanner.nextBoolean()

    if (hullDamage == true) {
        print("– эти повреждения серьезные'? Записывать Boolean переменную: ")
        damageSize = scanner.nextBoolean()
    }

    print("– текущая численность экипажа: ")
    staffSize = scanner.nextInt()

    print("– текущее количество ящиков провизии: ")
    proviant = scanner.nextInt()

    print("– благоприятные ли метеоусловия? Записывать Boolean переменную: ")
    meteoConditions = scanner.nextBoolean()

    if ((proviant > 50) && ((!hullDamage && (staffSize > 55) && (staffSize < 70)) || (!damageSize && (staffSize == 70) && meteoConditions))) {
        println("Можно плыть")
    } else{
        println("Плыть нельзя")
    }

}