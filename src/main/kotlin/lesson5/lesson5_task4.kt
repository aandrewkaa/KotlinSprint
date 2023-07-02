package lesson5

/** Created by Aandrewkaa **/

fun main() {
    val userLogin = "Batman"
    val userPass = "password"

    println("Введите имя пользователя.")
    var scaner = readln()

    if (scaner == userLogin) {
        println("Введите пароль для пользователя $userLogin")
        scaner = readln()
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
