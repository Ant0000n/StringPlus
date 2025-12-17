/*2.Нужно осуществить проверку номера телефона. Он должен начинаться с +7 и содержать 10 цифр,
не считая +7. Если телефон верно введен, выведите true, иначе false.*/

fun main() {
    val number = "+79180585794"
    print(trueNumber(number))
}

fun trueNumber(number: String): Boolean {
    if (!number.startsWith("+7")) return false
    if (number.length != 12) return false
    return number.substring(2).all { it.isDigit() }
}