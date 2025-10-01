package Problemes_5_Punts

import java.util.Scanner

fun main() {
    val sc= Scanner(System.`in`)
    val casos=sc.nextInt()
    sc.nextLine()
    repeat(casos){
        val nens=sc.nextLine().trim().split(" ")
        val numActivitats=sc.nextInt()
        val llistes=mutableListOf<MutableList<String>>()
        repeat(numActivitats){
            llistes.add(mutableListOf())
        }
        var assignedChildren=0
        for (act in 0..<numActivitats){
            val activitySize=sc.nextInt()
            for (i in assignedChildren..<activitySize+assignedChildren){
                if (i<nens.size){
                    llistes[act].add(nens[i])
                    assignedChildren++
                }
            }
        }
        sc.nextLine()
        for (i in 0..<numActivitats){
            println("Activitat ${i+1}: ${llistes[i]}")
        }
        if (nens.size==assignedChildren){
            println("Tots els nens han estat assignats.")
        }else{
            println("Nens sobrants: ${nens.last()}")
        }
    }
}