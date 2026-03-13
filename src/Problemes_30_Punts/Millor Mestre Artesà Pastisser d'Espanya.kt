package Problemes_30_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val numPastissos=sc.nextInt()
    var pastissos=MutableList(numPastissos){Pastis(sc.nextLong(),sc.nextLong())}
    val numJudges=sc.nextInt()
    val judges=Array(numJudges){Judge(sc.nextInt(),sc.nextInt())}
    pastissos.sortByDescending { it.sabor }
    pastissos=cleanUp(pastissos)
    answer(pastissos,judges)
    sc.close()
}

fun cleanUp(pastissos:MutableList<Pastis>):MutableList<Pastis>{
    var highestP=0L
    val new=mutableListOf<Pastis>()
    for (i in pastissos.indices){
        if (highestP<pastissos[i].estetica){
            new.add(pastissos[i])
            highestP=pastissos[i].estetica
        }
    }
    return new
}

fun answer(pastissos: MutableList<Pastis>, judges:Array<Judge>){
    for (judge in judges){
        var buscant=true
        var max=pastissos.size-1
        var min=0
        while (buscant){
            val i=(max-min)/2+min
            val S=pastissos[i].sabor
            val E=pastissos[i].estetica
            val punts=S*judge.sabor+E*judge.estetica
            if (i==0){
                val up=pastissos[i+1]
                val puntsUp=up.sabor*judge.sabor+up.estetica*judge.estetica
                if (puntsUp>punts){
                    min=1
                }else{
                    max=0
                }
            }else{
                val down=pastissos[i-1]
                val puntsDown=down.sabor*judge.sabor+down.estetica*judge.estetica
                val up=pastissos[i+1]
                val puntsUp=up.sabor*judge.sabor+up.estetica*judge.estetica
                if (puntsDown>punts){
                    max=i-1
                }else if (puntsUp>punts){
                    min=i+1
                }else{
                    min=i
                    max=i
                }
            }

            if (max==min){
                buscant=false
            }
        }
        val S=pastissos[min].sabor
        val E=pastissos[min].estetica
        println(S*judge.sabor+E*judge.estetica)
    }
}

data class Pastis(val sabor: Long, val estetica: Long)
data class Judge(val sabor:Int, val estetica:Int)