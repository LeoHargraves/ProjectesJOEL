package Problemes_15_Punts

import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    var total= mutableListOf(sc.nextInt(), sc.nextInt(), sc.nextInt())
    repeat(casos-1){
        val piscina=sc.nextInt()
        val platja=sc.nextInt()
        val futbol=sc.nextInt()
        if(platja<piscina){
            total[0]=total[2]+piscina
        }else{
            total[1]=total[2]+platja
        }
        if (piscina>futbol){
            if (total[1]>total[2]){
                total[0]=total[1]+piscina
            }
        }else{
            total[2]=total[1]+futbol
        }
        if (futbol<platja){
            if (total[0]>total[2]){
                total[1]=total[0]+platja
            }
        }else{
            if (total[0]>total[1]){
                total[2]=total[0]+futbol
            }
        }
    }
    println(total.joinToString(", "))
    sc.close()
}