package Problemes_11_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val numPlanetes=sc.nextInt()
        sc.nextLine()
        var planetes=listOf<Planeta>()
        repeat(numPlanetes){
            val (nom,dis,tam)=sc.nextLine().split(" ")
            planetes=planetes.plus(Planeta(nom,dis.toDouble(),tam.toDouble()))
        }
        val ordenats = planetes.sortedBy { it.distancia }
        val distMed=ordenats[ordenats.size/2]
        
    }
}

data class Planeta(val nom: String, val distancia: Double, val tamany: Double)