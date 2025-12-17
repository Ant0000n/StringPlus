/*4.Дана строка «kotlin2025course». Подсчитать количество содержащихся в ней цифр.*/

fun main(){
    val stroke = "kotlin2025course"
    val digit = stroke.filter { it.isDigit() }
    var counter = 0
    for (i in digit){
      counter++

    }
    print(counter)
}