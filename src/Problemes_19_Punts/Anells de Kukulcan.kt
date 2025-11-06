package Problemes_19_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val N=sc.nextInt()
    val matriu = Array(N) { IntArray(N) }
    for (i in 0 until N) {
        for (j in 0 until N) {
            matriu[i][j] = (i + 1) * (j + 1)
        }
    }
    val center=N/2
    for (xPlusCenter in 0..1){
        for (yPlusCenter in 0..1){

        }
    }

    sc.close()
}

/*
var num13=0
    var pos13=mutableListOf<Pair<Int,Int>>()
    for (x in N/2-1..N/2){
        for (y in N/2-1..N/2){
            if (matriu[x][y]==13){
                num13++
                pos13.add(Pair(x,y))
            }
        }
    }
    var tru=false
    for (coo in 1 until pos13.size){
        if (pos13[coo-1].first==pos13[coo].first||pos13[coo-1].second==pos13[coo].second){
            tru=true
        }
    }
    if (tru){
        println("NO")
    }else{

    }
 */