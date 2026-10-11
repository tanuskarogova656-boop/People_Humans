package ru.netology

//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
fun main() {
    val likes = 41
    val lastTwo = likes % 100
    val lastOne = likes % 10
    val word = if (lastTwo in 11..14) {
    }else when (lastOne){
        1 -> "человеку"
        else -> "людям"
    }
    println("Понравилось $likes $word")

}