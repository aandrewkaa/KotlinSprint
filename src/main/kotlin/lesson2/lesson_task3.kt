package lesson2

import kotlin.text.*

/**
Сайт с расписанием поездов получает данные с сервера.
Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

– Создай целочисленные переменные и проинициализируй их этими данными;
– Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
– Выведи результат в консоль.
 */

/** created by Aandrewkaa **/

/**
 *  Программа, для подсчета часа и минуты прибытия поезда
 */

fun main(){
    val timeStartHour = 9
    val timeStartMin = 39
    val timeInRoadMin = 457

    val timeFinishHour = (timeStartHour * 60 + timeInRoadMin + timeStartMin) / 60
    val timeFinishMin = (timeStartHour * 60 + timeInRoadMin + timeStartMin) % 60

    println(String.format("%02d:%02d - время прибытия поезда.", timeStartHour, timeFinishMin))

}