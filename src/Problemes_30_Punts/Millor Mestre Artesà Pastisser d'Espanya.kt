package Problemes_30_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val numPastissos=sc.nextInt()
    val pastissos=Array(numPastissos){Pastis(sc.nextInt(),sc.nextInt())}
    val numJudges=sc.nextInt()
    val judges=

    sc.close()
}

data class Pastis(val sabor:Int, val presentacio:Int)