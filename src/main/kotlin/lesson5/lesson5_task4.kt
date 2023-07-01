package lesson5

/** Created by Aandrewkaa **/

fun main() {
    val userLogin = "Batman"
    val userPass = "password"

    println("Введите имя пользователя.")
    var scaner = readLine()!!

    if (scaner == userLogin) {
        println("Введите пароль для пользователя $userLogin")
        scaner = readLine()!!
        if (scaner == userPass) {
            println("Добро пожаловать в систему!")
        } else {
            println("Ошибка авторизации!")
        }
    } else {
        println("пользователь не зарегистрирован в системе, " +
                "пожалуйста пройдите регистрацию!")
    }

}
