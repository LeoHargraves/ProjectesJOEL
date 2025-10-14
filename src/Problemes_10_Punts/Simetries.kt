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
        val matriu=mutableListOf<List<Int>>()
        repeat(numFiles){
            matriu.add(IntArray(numColumnes){sc.nextInt()}.toList())
        }

        var simetriaVertical=false
        if (numColumnes%2==0){
            simetriaVertical=checkVertical(matriu, true)
        }else{
            simetriaVertical=checkVertical(matriu, false)
        }
        var simetriaHoritzontal=false
        if (numFiles%2==0){
            simetriaHoritzontal=checkHoritzontal(matriu, true)
        }else{
            simetriaHoritzontal=checkHoritzontal(matriu, false)
        }
    }
}

fun checkVertical(matriu: MutableList<List<Int>>, parell: Boolean): Boolean{

}

fun checkHoritzontal(matriu: MutableList<List<Int>>, parell: Boolean): Boolean{

}