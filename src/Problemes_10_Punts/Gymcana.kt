package Problemes_10_Punts

import java.util.*
//El nen a qui li toca la prova després de la seqüència
fun main() {
    val sc = Scanner(System.`in`)
    repeat(sc.nextInt()) {
        //Agafem número inicial de nens
        var numNens=sc.nextInt()
        //Creem una MutableList amb els nens per calcular els torns
        val nens=MutableList(numNens){it+1}
        sc.nextLine()
        val accions=sc.nextLine()
        //Parsejem la String
        for (i in accions.indices) {
            if (accions[i]=='S') {
                nens.removeFirst()
            }
            else if (accions[i]=='N') {
                nens.add(nens.first())
                nens.removeFirst()
            }
            else{
                numNens++
                nens.add(numNens)
            }
        }
        println(nens.first())
    }
}