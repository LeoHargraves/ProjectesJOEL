package Problemes_10_Punts

import java.util.*
/*
Per cada cas de prova, caldrà respondre:

Si la matriu presenta simetria vertical i horitzontal, escriurà DOBLE
Si la matriu presenta simetria horitzontal però no vertical, escriurà HORITZONTAL
Si la matriu presenta simetria vertical però no horitzontal, escriurà VERTICAL
Si no presenta cap simetria, escriurà CAP
 */
fun main() {
    val sc = Scanner(System.`in`)
    repeat(sc.nextInt()) {
        val numFiles=sc.nextInt()
        val numColumnes=sc.nextInt()
        sc.nextLine()
        val matriu=mutableListOf<List<String>>()
        repeat(numFiles){
            matriu.add(sc.nextLine().split(" "))
        }
        var simetriaVertical=false
        simetriaVertical=checkVertical(matriu,numColumnes)

        var simetriaHoritzontal=false
        simetriaHoritzontal=checkHoritzontal(matriu, numFiles)
        when{
            simetriaHoritzontal&&simetriaVertical->println("DOBLE")
            simetriaHoritzontal->println("HORITZONTAL")
            simetriaVertical->println("VERTICAL")
            else->println("CAP")
        }
    }
}

fun checkVertical(matriu: MutableList<List<String>>, numColumnes:Int): Boolean{
    var simetric=true
    for (columna in 0..numColumnes/2){
        for (fila in matriu){
            if (fila[columna]!=fila[numColumnes-1-columna]){
                simetric=false
            }
        }
    }
    return simetric
}

fun checkHoritzontal(matriu: MutableList<List<String>>, numFiles:Int): Boolean{
    var simetric=true
    for (i in 0..numFiles/2){
        if (matriu[i]!=matriu[numFiles-i-1]){
            simetric=false
        }
    }
    return simetric
}