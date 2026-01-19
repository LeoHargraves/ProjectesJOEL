package Problemes_22_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val numActivitats=sc.nextInt()
    val maxPerDia=sc.nextInt()
    val numDies=numActivitats/maxPerDia
    var resto=maxPerDia-numActivitats%maxPerDia
    val activitats=IntArray(numActivitats){sc.nextInt()}
    //Calcular valors potencials. Ej: primer dia((1,2,3)real)(4,5)potencial)

    sc.close()
}