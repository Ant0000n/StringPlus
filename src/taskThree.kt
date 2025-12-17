/*3.Дана строка.
Вывести символы, составляющие эту строку, но в обратном порядке.*/

fun main(){
    val stroke = "Меня зовут Антон"
    val reversStroke = stroke.reversed()
    reversStroke.forEach { i -> print(i) }
}