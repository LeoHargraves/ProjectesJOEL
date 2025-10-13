package Problemes_20_Punts

//Per cada cas de prova es respondrà:
//
//SI quan sigui possible construir dues files amb els números donats de tal manera que el sumatori dels valors
// de la fila1 i els sumatori dels valors de la fila2 tingui una diferència d’ 1
//
//NO cas contrari

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    repeat(sc.nextLine().toInt()) {
        val dau= IntArray(5){sc.nextInt()}.sorted()
        if (dau[1]+dau[4]!=dau[2]+dau[3]){
            println("IMPOSSIBLE")
        }else{
            println((dau[2]+dau[3])-dau[0])
        }
    }
}