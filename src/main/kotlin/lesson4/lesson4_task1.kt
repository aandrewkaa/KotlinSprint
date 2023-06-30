package lesson4

/** На сайте ресторана есть онлайн бронирование.
 * Бронирование доступно, когда есть свободные столики.
 * Всего в ресторане 13 столов и их количество всегда неизменно.
 * На сегодня забронированы все столики. А на завтра осталось еще 4 свободных.

Напиши программу, которая сообщает информацию о бронировании в момент запроса,
путем сравнения данных о свободных столах с данными о столах в ресторане.

– Создать переменные с количеством забронированных столов на сегодня и на завтра;
– Вывести в консоль сообщение о доступности столиков в одном println();
– Каждое сообщение с новой строки (НЕ использовать многострочный вывод (“”” “””));
– Формат сообщений такой: [Доступность столиков на сегодня: true/false], [Доступность столиков на завтра: true/false].
 **/

/** Created by Aandrewkaa **/

fun main() {
    val tableQuantityToday = 13
    val tableQuantityTomorrow = 9

    println("Доступность столиков на сегодня: ${tableQuantityToday < 13}, \n Доступность столиков на завтра: ${tableQuantityTomorrow < 13} ")
}
