package Problemes_10_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        var rondes=sc.nextInt()
        val numParaules=sc.nextInt()
        val numJugadors=sc.nextInt()
        sc.nextLine()
        val jugadors=sc.nextLine().trim().split(" ").toMutableList()
        while (rondes>0&&jugadors.isNotEmpty()){
            jugadors.removeAt((numParaules-1)%jugadors.size)
            rondes--
        }
        println(jugadors.joinToString(" "))
    }
    sc.close()
}