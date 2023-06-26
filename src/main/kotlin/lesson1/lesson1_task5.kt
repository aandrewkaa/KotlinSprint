package lesson1

/** Created by Aandrewkaa **/

/* программа с иформацией о
полете Юрия Гагарина в космос
 */

fun main() {
    val seconds: Int = 6480
    val minute: Int = seconds / 60

    println(String.format("%d:%02d",minute, seconds % 60))
}
