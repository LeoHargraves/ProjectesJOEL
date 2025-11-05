package Problemes_30_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val tamanyAsteroide=sc.nextDouble()
        val numPistoles = sc.nextInt()
        when (numPistoles) {
            2->{
                var limit=tamanyAsteroide//100.0
                val valors=Array(2){1.0/sc.nextDouble()}//2.0 i 5.0
                valors.sort()
                while (limit>1.0){
                    val tercerValor=limit/valors[1]//100.0/4.0 = 25.0
                    val maxRange=limit/valors.first()//100.0/2.0 = 50.0
                    val minRange=limit/valors.last()//100.0/5.0 = 20.0
                    val NmaxRange=limit/valors.first()//50.0/5.0 = 10.0
                    val NminRange=limit/valors.last()//20.0/2.0 = 10.0
                }
            }
            /*
            1. Dividir valor màxim pel més alt i minim pel més baix
            2. fer la mitja
             */
        }
        val pistoles=Array(numPistoles){1.0/sc.nextDouble()}
        pistoles.sort()
        val rangPossible=MutableList(numPistoles){}
    }
    sc.close()
}