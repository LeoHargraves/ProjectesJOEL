package Problemes_11_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`).useLocale(Locale.UK)
    val casos=sc.nextInt()
    repeat(casos){
        val numPlanetes=sc.nextInt()
        sc.nextLine()
        var planetes=listOf<Planeta>()
        repeat(numPlanetes){
            val nom=sc.next()
            val dis=sc.nextDouble()
            val tam=sc.nextDouble()
            sc.nextLine()
            planetes=planetes.plus(Planeta(nom,dis.toDouble(),tam.toDouble()))
        }
        val ordenats = planetes.sortedBy { it.distancia }
        val distMed=ordenats[ordenats.size/2].distancia
        var candidats=listOf<Planeta>()
        for (planeta in ordenats){
            if (planeta.distancia==distMed){
                candidats=candidats.plus(planeta)
            }
        }
        val theChosenOne=(candidats.sortedBy { it.tamany })[candidats.size/2]
        println(theChosenOne.nom)
    }
}

data class Planeta(val nom: String, val distancia: Double, val tamany: Double)