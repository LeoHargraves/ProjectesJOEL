package Problemes_16_Punts

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    repeat(sc.nextInt()){
        val numCartes=sc.nextInt()
        val jo= IntArray(numCartes){sc.nextInt()}.toMutableList()
        val taula= IntArray(numCartes){sc.nextInt()}.toMutableList()
        var contadorJo=0
        while (contadorJo<jo.size){
            var contadorTaula=0
            while (contadorTaula<taula.size){
                if (jo[contadorJo]>taula[contadorTaula]&&jo[contadorJo]<=taula[contadorTaula]){

                }
                contadorTaula++
            }
            contadorJo++
        }
    }

    sc.close()
}