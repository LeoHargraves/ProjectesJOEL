package Problemes_10_Punts

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