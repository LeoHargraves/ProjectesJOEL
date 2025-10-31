package Problemes_8_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val knightX=sc.nextInt()
        val knightY=sc.nextInt()
        val aspidX=sc.nextInt()
        val aspidY=sc.nextInt()
        val relativeX=knightX-aspidX
        val relativeY=knightY-aspidY
        if ((relativeY==relativeX||relativeY==0||relativeX==0)&&(relativeY>=0&&relativeX>=0)){
            println("HIT")
        }else{
            println("MISS")
        }
    }
    sc.close()
}