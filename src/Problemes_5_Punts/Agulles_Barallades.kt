package Problemes_5_Punts

import java.util.Scanner

fun main() {
    val sc= Scanner(System.`in`)
    val rep=sc.nextInt()
    sc.nextLine()
    repeat(rep) {
        val input=sc.nextLine()
        var output="NO"
        val hora=input.split(":")
        val h = hora[0].toInt()
        val m = hora[1].toInt()
        //Assignar grau d'obertura a cada agulla i solucionar 360º a 0º
        var hAngle=h*30+m/12*6
        if (hAngle==360){hAngle=0}
        val mAngle=m*6
        if (hAngle-mAngle==180||hAngle-mAngle==-180){
            output="SI"
        }
        println(output)
    }
}