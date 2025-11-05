package Problemes_20_Punts

import java.util.*
import kotlin.collections.mutableListOf

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val linies=sc.nextInt()
        val startingPositions=emptyArray<Pair<Int,Int>>()
        for(it in 0..<linies/2){
            val value=sc.nextInt()
            if (value==1) {
                startingPositions.plus(Pair(it/(linies/2-1),it%(linies/2-1)))
            }
        }
        val finalPositions=emptyArray<Pair<Int,Int>>()
        for(it in 0..<linies/2){
            val value=sc.nextInt()
            if (value==1) {
                finalPositions.plus(Pair(it/(linies/2-1),it%(linies/2-1)))
            }
        }
    }
    sc.close()
}

fun piedraAlAgua(start:MutableList<MutableList<Int>>, end:MutableList<MutableList<Int>>,size:Int): String{
    var radi=0
    var output="NO SINCRONITZADA"
    var bucle=true
    while (bucle){

        radi++
        if (radi==size){
            bucle=false
        }
    }
    return output
}