package lesson3

/**
 * Девушка по имени Андреева Татьяна Сергеевна в 22 года вышла замуж за Сидорова,
 * и поменяла фамилию. О ней есть запись в одном из государственных приложений.
 * Приложение отслеживает изменения персональных данных граждан.

Выведи в консоль данные на момент когда ей было 20 и на момент когда ей было 22 в формате [ФИО, возраст].
Все части ФИО и возраст изначально хранятся в отдельных переменных.
 */

/** Created by Aandrewkaa **/

fun main() {
    val name20 = "Татьяна"
    val patronymic20 = "Андреева"
    val surename20 = "Сергеева"
    val age1 = 20

    val name22 = "Татьяна"
    val patronymic22 = "Андреева"
    val surename22 = "Сидорова"
    val age2 = 22

    println("[$surename20 $name20 $patronymic20, $age1]")
    println("[$surename22 $name22 $patronymic22, $age2]")

}