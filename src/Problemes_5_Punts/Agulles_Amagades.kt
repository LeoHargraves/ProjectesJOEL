package Problemes_5_Punts

import java.util.Scanner

fun main() {
    val sc= Scanner(System.`in`)
    val rep=sc.nextInt()
    sc.nextLine()
    repeat(rep){
        val input=sc.nextLine()
        if ("12:00"==input){
            println("SI")
        }else{
            var output="NO"
            val hora=input.split(":")
            if ((hora[1].toInt()/5)==hora[0].toInt()&&(hora[1].toInt()%5)==(hora[1].toInt()/12)){
                output="SI"
            }
            println(output)
        }
    }
}