package Problemes_20_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    repeat(sc.nextInt()){
        val numValors=sc.nextInt()
        val values= mutableListOf<Int>()
        var sumAll=0
        repeat(numValors){
            val value=sc.nextInt()
            if (value!=0){
                values.add(value)
                sumAll+=value
            }
        }
        if (sumAll%2==0){
            println("NO")
        }else{

        }
    }
}