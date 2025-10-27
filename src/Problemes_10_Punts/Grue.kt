package Problemes_10_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val length = sc.nextInt()
        val orders=Array(length){sc.nextInt()}
        val answers=Array(length){sc.nextInt()}
        var x=0
        var y=0
        for(i in orders.indices){
            when(answers[i]){
                -1 ->{
                    x=0
                    y=0
                }
                0 ->{
                    when(orders[i]){
                        1->y++
                        2->y--
                        3->x--
                        4->x++
                    }
                }
            }
        }
        println("$x,$y")
    }
    sc.close()
}