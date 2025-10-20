package Problemes_15_Punts

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var total= mutableListOf(0, 0, 0)
    repeat(sc.nextInt()){
        val piscina=sc.nextInt()
        val platja=sc.nextInt()
        val futbol=sc.nextInt()
        if (it==0){
            total[0]=piscina
            total[1]=platja
            total[2]=futbol
        }else{
            total[0]=piscina
            total[1]=platja
            total[2]=futbol
        }
    }
    println()
    sc.close()
}