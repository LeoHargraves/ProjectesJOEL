package Problemes_22_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val N=sc.nextInt()
    val H=sc.nextInt()
    val forats= MutableList(H){0}
    val esquerra=mutableMapOf<Int,Int>()
    val dreta=mutableMapOf<Int,Int>()
    for (i in 0..<N) {
        val llargada=sc.nextInt()
        if (i%2==0) {
            if (esquerra.containsKey(llargada)){
                esquerra[llargada] = esquerra[llargada]!! + 1
            }else{
                esquerra[llargada] = 1
            }
        }else{
            if (dreta.containsKey(llargada)){
                dreta[llargada] = dreta[llargada]!! + 1
            }else{
                dreta[llargada] = 1
            }
        }
    }
    var sumaAcumulada=0
    val esquerraDescendent=esquerra.keys.sortedDescending()
    for (i in esquerraDescendent.indices){
        sumaAcumulada+=esquerra[esquerraDescendent[i]]!!
        if(i==esquerraDescendent.size-1){
            for (x in esquerraDescendent[i] downTo 1){
                forats[x-1]+=sumaAcumulada
            }
        }else{
            for (x in esquerraDescendent[i] downTo esquerraDescendent[i+1]+1){
                forats[x-1]+=sumaAcumulada
            }
        }
    }
    sumaAcumulada=0
    val dretaDescendent=dreta.keys.sortedDescending()
    for (i in dretaDescendent.indices){
        sumaAcumulada+=dreta[dretaDescendent[i]]!!
        if(i==dretaDescendent.size-1){
            for (x in dretaDescendent[i] downTo 1){
                forats[forats.size-x]+=sumaAcumulada
            }
        }else{
            for (x in dretaDescendent[i] downTo dretaDescendent[i+1]+1){
                forats[forats.size-x]+=sumaAcumulada
            }
        }
    }
    val minim=forats.min()
    var numForats=0
    for (x in forats){
        if (x==minim){
            numForats++
        }
    }
    println("$minim $numForats")
    sc.close()
}