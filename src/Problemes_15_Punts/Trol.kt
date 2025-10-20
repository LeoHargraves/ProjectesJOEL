package Problemes_15_Punts

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    repeat(sc.nextInt()){
        val numIni=sc.nextLong()
        val numFin=sc.nextLong()
        val range=numFin-numIni+1
        var output=range/9*45
        for (x in numIni until numIni+range%9){
            output+=dumbNum(x.toLong())
        }

        println(output)
    }
    sc.close()
}

fun dumbNum(num:Long):Int{
    val str=num.toString()
    var result=0
    for (unitat in str){
        result+=unitat.digitToInt()
    }
    if (result>9){
        result=dumbNum(result.toLong())
    }
    return result
}