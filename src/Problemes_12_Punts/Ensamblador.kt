package Problemes_12_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    repeat(sc.nextInt()){
        var output=0
        var count=0
        val functions= mutableMapOf<String, MutableList<String>>()
        val lineas=sc.nextInt()
        sc.nextLine()
        while(lineas>count){
            count++
            val input=sc.nextLine()
            if (checkFunctions(input)){
                val function=mutableListOf<String>()
                var funInput=sc.nextLine()
                count++
                while (funInput!="END"){
                    function.add(funInput)
                    funInput = sc.nextLine()
                    count++
                }
                functions.put(input.split(" ").last(),function)
            }else{
                if (input.contains("CALL")){
                    for (x in functions[input.split(" ").last()]!!){
                        output= compilador(x,output)
                    }
                }else{
                    output= compilador(input,output)
                }
            }
        }
        println(output%1000000007)
    }
}

fun checkFunctions(input: String): Boolean {
    val funOrders= listOf("FUN","END")
    return funOrders.contains(input.split(" ").first())
}

fun check(enter: Int):Boolean {
    if (enter < 0) {
        return false
    }
    if (enter > 100000) {
        return false
    }
    return true
}

fun compilador(input:String,valor:Int):Int{
    var output = valor
    val parts=input.split(" ")
    val ordre=parts[0]
    val enter=parts[1].toInt()
    when(ordre){
        "ADD"->output += enter
        "SUB"->output -= enter
        "MULT"->output *= enter
    }
    return output
}