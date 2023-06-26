package lesson1

/** Created by Aandrewkaa **/

/* программа с иформацией о
полете Юрия Гагарина в космос
 */

fun main() {
    val seconds: Int = 6480

    val minute: Int = seconds / 60

    println(seconds.toString().padStart(2, '0')+":"+(seconds % 60).toString().padStart(2, '0'))
}
