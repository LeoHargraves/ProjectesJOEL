package Problemes_15_Punts

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    var total= mutableListOf(sc.nextInt(), sc.nextInt(), sc.nextInt())
    repeat(casos-1){
        val piscina=sc.nextInt()
        val platja=sc.nextInt()
        val futbol=sc.nextInt()
        val temporal=mutableListOf(0,0,0)
        temporal[0]=piscina+maxOf(total[1],total[2])
        temporal[1]=platja+maxOf(total[0],total[2])
        temporal[2]=futbol+maxOf(total[1],total[0])
        total=temporal.toMutableList()
    }
    println(total.max())
    sc.close()
}