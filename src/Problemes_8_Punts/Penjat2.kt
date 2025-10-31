package Problemes_8_Punts

import java.util.Scanner

fun main() {
    val sc= Scanner(System.`in`)
    val dibuix=listOf("+---+\n" +
            "|   \n" +
            "|\n" +
            "|\n" +
            "===","+---+\n" +
            "|   O\n" +
            "|\n" +
            "|\n" +
            "===","+---+\n" +
            "|   O\n" +
            "|   |\n" +
            "|\n" +
            "===","+---+\n" +
            "|   O\n" +
            "|  /|\n" +
            "|\n" +
            "===","+---+\n" +
            "|   O\n" +
            "|  /|\\\n" +
            "|\n" +
            "===","+---+\n" +
            "|   O\n" +
            "|  /|\\\n" +
            "|  /\n" +
            "===","+---+\n" +
            "|   O\n" +
            "|  /|\\\n" +
            "|  / \\\n" +
            "===")
    val rep=sc.nextInt()
    sc.nextLine()
    repeat(rep){
        val secretWord=sc.nextLine().lowercase()
        val index=secretWord.withIndex().groupBy({ it.value }, { it.index })
        var hiddenWord="_".repeat(secretWord.length)
        var health=5
        val previous=mutableListOf<String>()
        var input=sc.nextLine().lowercase()
        while (input!="1974"&&health in 1..5){
            if (input.length == 1 && input[0].isLetter() && !previous.contains(input)){
                previous.add(input)
                if(secretWord.contains(input)){
                    for (i in index[input[0]]!!){
                        hiddenWord = hiddenWord.replaceRange(i, i + 1, input[0].toString())
                    }
                    println("$hiddenWord\n${dibuix[5-health]}")
                }else{
                    health--
                    println("$hiddenWord\n${dibuix[5-health]}")
                }
                if (!hiddenWord.contains("_")){
                    health=69
                }
            }
            if (health in 1..5){
                input=sc.nextLine().lowercase()
            }
        }
        if (health==69){
            println("Felicitats! Has endevinat la paraula")
        }else{
            println("Vaja! No has endevinat la paraula")
        }
    }
}