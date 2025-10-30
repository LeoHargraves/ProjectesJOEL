package Problemes_10_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    sc.nextLine()
    repeat(casos){
        var num1=sc.next()
        var num2=sc.next()
        var unitat1=0.0
        var unitat2=0.0
        for (unitat in num1){
            if (num2.contains(unitat)){
                unitat1=num1.replace("$unitat","").toDouble()
                unitat2=num2.replace("$unitat","").toDouble()
            }
        }
        if (num1.toDouble()/num2.toDouble()==unitat1/unitat2){
            println("SI")
        }else{
            println("NO")
        }
    }
    sc.close()
}