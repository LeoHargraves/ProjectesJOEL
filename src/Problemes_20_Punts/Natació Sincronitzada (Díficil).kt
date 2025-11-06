package Problemes_20_Punts

import java.util.*
import kotlin.collections.mutableListOf
import kotlin.math.abs

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val linies=sc.nextInt()
        var startingPositions=emptyArray<Pair<Int,Int>>()
        for(it in 0..<linies*linies/4){
            val value=sc.nextInt()
            if (value==1) {
                startingPositions=startingPositions.plus(Pair(it/(linies/2),it%(linies/2)))
            }
        }
        var finalPositions=emptyArray<Pair<Int,Int>>()
        for(it in 0..<linies*linies/4){
            val value=sc.nextInt()
            if (value==1) {
                finalPositions=finalPositions.plus(Pair(it/(linies/2),it%(linies/2)))
            }
        }
        println(piedraAlAgua(startingPositions,finalPositions,linies/2))
    }
    sc.close()
}

fun piedraAlAgua(start: Array<Pair<Int,Int>>, end: Array<Pair<Int,Int>>, size:Int):String{
    var radi=0
    var output="NO SINCRONITZADA"
    var coincidencias=listOf(mutableListOf<String>(),mutableListOf<String>(),mutableListOf<String>())
    var bucle=true
    while (bucle){
        for (pos in 0..2){
            if (radi==maxOf(abs(start[pos].first-end[0].first),abs(start[pos].second-end[0].second))){
                coincidencias[pos].add("a")
            }
            if (radi==maxOf(abs(start[pos].first-end[1].first),abs(start[pos].second-end[1].second))){
                coincidencias[pos].add("b")
            }
            if (radi==maxOf(abs(start[pos].first-end[2].first),abs(start[pos].second-end[2].second))){
                coincidencias[pos].add("c")
            }
        }
        var weLose=true
        for (x in coincidencias[0]) {
            for (y in coincidencias[1]) {
                for (z in coincidencias[2]) {
                    val convined=z+y+x
                    if (convined.contains("a")&&convined.contains("b")&&convined.contains("c")){
                        bucle=false
                        output=radi.toString()
                        weLose=false
                    }
                }
            }
        }
        if (weLose){
            for (x in coincidencias){
                x.clear()
            }
        }
        radi++
        if (radi==size){
            bucle=false
        }
    }
    return output
}