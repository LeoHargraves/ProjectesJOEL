package Problemes_16_Punts

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    repeat(sc.nextInt()){
        val numCartes=sc.nextInt()
        val joUn= IntArray(numCartes){sc.nextInt()}.toMutableList()
        val taulaUn= IntArray(numCartes){sc.nextInt()}.toMutableList()
        val jo=joUn.sorted().toMutableList()
        val taula=taulaUn.sorted().toMutableList()
        var puntuacio=0
        puntuacio+=calculateWins(jo,taula)
        calculateDraws(jo,taula)
        puntuacio-=taula.size
        if (puntuacio>0){
            println("Victoria")
        }else if (puntuacio==0){
            println("Empate")
        }else{
            println("Derrota")
        }
    }

    sc.close()
}

fun calculateWins(jo: MutableList<Int>, taula: MutableList<Int>):Int{
    var puntuacio=0
    var contadorJo=0
    while (contadorJo<jo.size){
        var contadorTaula=0
        while (contadorTaula<taula.size){
            if (contadorTaula==taula.size-1&&jo[contadorJo]>taula[contadorTaula]){
                taula.removeAt(contadorTaula)
                jo.removeAt(contadorJo)
                puntuacio++
                contadorTaula=taula.size
                contadorJo--
            }else if (jo[contadorJo]>taula[contadorTaula]&&jo[contadorJo]<=taula[contadorTaula+1]){
                taula.removeAt(contadorTaula)
                jo.removeAt(contadorJo)
                puntuacio++
                contadorTaula=taula.size
                contadorJo--
            }else if(jo[contadorJo]<=taula[contadorTaula]){
                contadorTaula=taula.size
            }
            contadorTaula++
        }
        contadorJo++
    }
    return puntuacio
}

fun calculateDraws(jo: MutableList<Int>, taula: MutableList<Int>){
    var contadorJo=0
    while (contadorJo<jo.size){
        var contadorTaula=0
        while (contadorTaula<taula.size){
            if (contadorTaula==taula.size-1&&jo[contadorJo]==taula[contadorTaula]){
                taula.removeAt(contadorTaula)
                jo.removeAt(contadorJo)
                contadorTaula=taula.size
                contadorJo--
            }else if (jo[contadorJo]==taula[contadorTaula]&&jo[contadorJo]<taula[contadorTaula+1]){
                taula.removeAt(contadorTaula)
                jo.removeAt(contadorJo)
                contadorTaula=taula.size
                contadorJo--
            }else if(jo[contadorJo]<taula[contadorTaula]){
                contadorTaula=taula.size
            }
            contadorTaula++
        }
        contadorJo++
    }
}