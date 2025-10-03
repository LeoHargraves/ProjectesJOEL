package Problemes_2_Punts

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val rep=sc.nextInt()
    repeat(rep){
        val lista=mutableMapOf<String,Int>()
        val num=sc.nextInt()
        sc.nextLine()
        repeat(num){
            val input =sc.nextLine()
            if(lista.contains(input)){
                lista.put(input,lista[input]!!+1)
            }else{
                lista.put(input,1)
            }
        }
        var output=lista.values.first()
        for (x in lista.values){
            if (x>output){
                output=x
            }
        }
        println(lista.entries.firstOrNull { it.value == output }?.key)
    }
}