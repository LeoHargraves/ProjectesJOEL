package Problemes_3_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val input=sc.nextInt()
        if (input%180==0){
            println("OK")
        }else{
            println("BRONCA")
        }
    }
    sc.close()
}