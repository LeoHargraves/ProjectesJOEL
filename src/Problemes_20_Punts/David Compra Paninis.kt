package Problemes_20_Punts

import java.util.*

fun main() {
    ver2()
}

fun ver2(){
    val sc = Scanner(System.`in`)
    val numPaninis=sc.nextInt()
    val casos=sc.nextInt()
    //Ordenar la llista inicial per no haver-ho de fer tota la estona
    val paninis=IntArray(numPaninis){sc.nextInt()}.toList().sorted()
    repeat(casos){
        version2(paninis, sc.nextInt(),sc.nextInt())
    }
}

//Versió 2 perque resulta(surprise surprise) que s'ha d'optimitzar
fun version2(paninis:List<Int>, moneyCap:Int,numItems:Int){
    var output=0
    var end=0
    var start=0
    while (start+end<numItems){
        val fromEnd=(2*moneyCap-(paninis[paninis.size-end-1]))
        if (paninis[start]>fromEnd){
            output+=fromEnd
            end++
        }else{
            output+=paninis[start]
            start++
        }
    }
    println(output)
}




//Versió 1 per si de cas s'ha d'optimitzar més

fun ver1(){
    val sc = Scanner(System.`in`)
    val numPaninis=sc.nextInt()
    val casos=sc.nextInt()
    val paninis=IntArray(numPaninis){sc.nextInt()}.toList()
    repeat(casos){
        version1(paninis,sc.nextInt(),sc.nextInt())
    }
}

fun version1(paninis:List<Int>,moneyCap:Int,numItems:Int){
    val diff= mutableListOf<Int>()
    for (x in paninis){
        if (x<moneyCap){
            diff.add(x)
        }else{
            diff.add(2*moneyCap-x)//Same as (moneyCap-(x-moneyCap)) but prettier
        }
    }
    diff.sort()
    var output=0
    for (i in 0..<numItems){
        output+=diff[i]
    }
    println(output)
}