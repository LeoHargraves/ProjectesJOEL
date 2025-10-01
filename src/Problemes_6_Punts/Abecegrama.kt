package Problemes_6_Punts

import java.util.Scanner

fun main() {
    val abecedario="abcdefghijklmnñopqrstuvwxyz"
    val sc= Scanner(System.`in`)
    val rep=sc.nextInt()
    sc.nextLine()
    var output="SI"
    if (rep==0){
        output="NO"
    }
    for (i in 0..<rep){
        if (sc.nextLine().first()!=abecedario[i]){
            output="NO"
        }
    }
    println(output)
}