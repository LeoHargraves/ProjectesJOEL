package Problemes_7_Punts

import java.util.Scanner
//Versió 2 soluciona: Output ERROR no es mostrava a alguns inputs
fun main() {
    val sc= Scanner(System.`in`)
    val rep=sc.nextInt()
    sc.nextLine()
    repeat(rep){
        val list =sc.nextLine().split(" ")
        println(Output(list))
    }
}

fun Output(list: List<String>): String{
    var repeated= listOf<String>()
    for (x in list){
        if (repeated.contains(x)){
            return "ERROR"
        }
        repeated = repeated.plus(x)
    }
    return CheckPossible(list)
}

fun PosChange(pos: String): String{
    val letter=pos.first()
    var convert="1"
    when(letter){
        'a'->convert="1"
        'b'->convert="2"
        'c'->convert="3"
        'd'->convert="4"
        'e'->convert="5"
        'f'->convert="6"
        'g'->convert="7"
        'h'->convert="8"
    }
    val result=convert+pos.last()
    return result
}

fun PosSum(pos: String):Int{
    val values=PosChange(pos)
    val result=values[0].toString().toInt()+values[1].toString().toInt()
    return result
}

fun PosRes(pos: String):Int{
    val values=PosChange(pos)
    val result=values[0].toString().toInt()-values[1].toString().toInt()
    return result
}
fun CheckPossible(list: List<String>): String{
    var response="SI"
    for (i in 0..6){
        for (x in list.subList(i+1,7)){
            if (x[0]==list[i][0]||x[1]==list[i][1]||PosRes(x)==PosRes(list[i])||PosSum(x)==PosSum(list[i])){
                response= "NO"
            }
        }
    }
    return response
}