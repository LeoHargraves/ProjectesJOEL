package Problemes_5_Punts

import java.util.Scanner

fun main() {
    val sc= Scanner(System.`in`)
    var input=sc.nextLine()
    while (input!="99:99 0"){
        println(Calcular(input))
        input=sc.nextLine()
    }
}

fun Calcular(input: String): Int{
    var energy=0
    val broken=input.split(" ")
    val laps=broken[1].toInt()
    val originalTime=broken[0].split(":")
    var hour=originalTime[0].toInt()
    var minute=originalTime[1].toInt()
    repeat(laps+1){
        var hourS=hour.toString()
        if (hourS.length==1){hourS= "0$hourS" }
        var minuteS=minute.toString()
        if (minuteS.length==1){minuteS= "0$minuteS" }
        var clock=hourS+minuteS
        energy+=Read(clock)
        if (minute==59){
            minute=0
            if (hour==23){
                hour=0
            }else{hour++}
        }else{minute++}
    }
    return (laps+1)*10+energy
}

fun Read(clock: String):Int{
    var counter=0
    for (x in clock){
        when(x){
            '0'->counter+=6
            '1'->counter+=2
            '2'->counter+=5
            '3'->counter+=5
            '4'->counter+=4
            '5'->counter+=5
            '6'->counter+=6
            '7'->counter+=3
            '8'->counter+=7
            '9'->counter+=6
        }
    }
    return counter*15
}