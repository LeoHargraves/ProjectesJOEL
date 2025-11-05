package Problemes_5_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val objectiu=sc.nextInt()
        val jo=sc.nextInt()
        var guanyador=0
        if (objectiu%4==0){
            guanyador=1
        }
        if (jo==guanyador){
            println("JO")
        }else{
            println("GANGPLANK")
        }
    }
    sc.close()
}