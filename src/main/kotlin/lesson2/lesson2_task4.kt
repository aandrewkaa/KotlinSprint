package lesson2

/** created by Aandrewkaa **/

fun main() {

    val rudeMetal = 11
    val rudeCristal = 7
    val buffSize = 20

    println(String.format("%d - бонусное количество металлической руды.", (rudeMetal * buffSize / 100)))
    println(String.format("%d - бонусное количество кристалической руды.", (rudeCristal * buffSize / 100)))
}