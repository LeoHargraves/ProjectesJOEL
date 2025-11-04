package Problemes_20_Punts

import java.util.*
import kotlin.collections.mutableListOf

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val linies=sc.nextInt()
        val start=mutableListOf<MutableList<Int>>()
        repeat(linies/2){
            start.add(MutableList(linies/2){sc.nextInt()})
        }
        val end=mutableListOf<MutableList<Int>>()
        repeat(linies/2){
            end.add(MutableList(linies/2){sc.nextInt()})
        }
    }
    sc.close()
}

fun piedraAlAgua(start:MutableList<MutableList<Int>>, end:MutableList<MutableList<Int>>): String{
    var radi=0
    var output="NO SINCRONITZADA"
    var bucle=true
    while (bucle){

    }
    return output
}