package Problemes_20_Punts

import java.util.*
import kotlin.collections.mutableListOf
import kotlin.math.sqrt

import kotlin.math.abs
import kotlin.math.max

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
        println(chat(startingPositions,finalPositions,linies/2))
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
            if (radi==maxOf(start[pos].first-end[0].first,start[pos].second-end[0].second)||radi==maxOf(end[0].first-start[pos].first,end[0].second-start[pos].second)){
                coincidencias[pos].add("a")
            }
            if (radi==maxOf(start[pos].first-end[1].first,start[pos].second-end[1].second)||radi==maxOf(end[1].first-start[pos].first,end[1].second-start[pos].second)){
                coincidencias[pos].add("b")
            }
            if (radi==maxOf(start[pos].first-end[2].first,start[pos].second-end[2].second)||radi==maxOf(end[2].first-start[pos].first,end[2].second-start[pos].second)){
                coincidencias[pos].add("c")
            }
        }
        var weLose=false
        for (x in coincidencias[0]) {
            for (y in coincidencias[1]) {
                for (z in coincidencias[2]) {
                    val convined=z+y+x
                    if (convined.contains("a")&&convined.contains("b")&&convined.contains("c")){
                        bucle=false
                        output=radi.toString()
                        weLose=true
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

fun chat(start: Array<Pair<Int, Int>>, end: Array<Pair<Int, Int>>, size: Int): String {
    var radi = 0
    var output = "NO SINCRONITZADA"

    while (radi <= size) {
        // Reset coincidencias each loop
        val coincidencias = List(3) { mutableListOf<String>() }

        // Compute reachable targets for each start point
        for (pos in 0..2) {
            for (j in 0..2) {
                val dist = max(abs(start[pos].first - end[j].first), abs(start[pos].second - end[j].second))
                if (dist == radi) {
                    coincidencias[pos].add(('a' + j).toString())
                }
            }
        }

        // Check if we can pick one distinct letter per list
        val hasDistinct = coincidencias[0].any { a ->
            coincidencias[1].any { b ->
                coincidencias[2].any { c ->
                    setOf(a, b, c).size == 3 // distinct a,b,c
                }
            }
        }

        if (hasDistinct) {
            output = radi.toString()
            break
        }

        radi++
    }

    return output
}
