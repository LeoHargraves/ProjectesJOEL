package Problemes_15_Punts

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val distancia=sc.nextInt()
        val numCordills=sc.nextInt()
        val cordills=Array(numCordills){sc.nextInt()}
        var output="NO"
        for(i in 0 until numCordills*numCordills){
            var j=i
            var suma=0
            for(x in cordills){
                if (j%2==1){
                    suma+=x
                }
                j/=2
            }
            if (suma==distancia){
                output="SI"
            }
        }
        println(output)
    }
    sc.close()
}