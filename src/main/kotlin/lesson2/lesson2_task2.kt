package lesson2

/** Created by Aandrewkaa **/

/** Пишем часть гипотетического софта для бухгалтерии! */

fun main(){
    val staff = 50
    val staffTest = 30
    val salaryStaff = 30000
    val salaryTest = 20000

    val sumSalaryStaff = staff * salaryStaff
    val sumSalary = sumSalaryStaff + staffTest * salaryTest
    val salaryMedia = sumSalary / (staff + staffTest)

    println("$sumSalaryStaff – Расходы на выплату зарплаты постоянных сотрудников;")
    println("$sumSalary – Общие расходы по ЗП после прихода стажеров;")
    println("$salaryMedia – Средняя ЗП одного сотрудника после устройства стажеров.")
}