package Problemes_15_Punts

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val tamany=sc.nextInt()
        val maxValorsPerPis= IntArray(tamany){0}
        for (i in 1..tamany){
            if (i==1||i==tamany){

            }
        }
    }
    sc.close()
}

fun convertir(num:Int,tamany:Int):Int{
    var output=num-tamany
    if(output<0){
        output*-1
    }
    return output
}