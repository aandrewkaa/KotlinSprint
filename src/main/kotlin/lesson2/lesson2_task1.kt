package lesson2

/** Created by Aandrewkaa **/

/** Пишем часть школьного софта, который посчитает средний балл по английскому для этого класса.*/


fun main(){
    val quantityStudents = 4.0
    val markNum1 = 3.0
    val markNum2 = 4.0
    val markNum3 = 3.0
    val markNum4 = 5.0

    val arithMean = (markNum1 + markNum2 + markNum3 + markNum4)/quantityStudents

    println(String.format("%.2f",arithMean))
}



