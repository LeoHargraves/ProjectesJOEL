package Problemes_10_Punts
import java.util.*
import kotlin.math.log

//Per cada cas de prova s’indicarà el
//mínim número de ratolins necessaris per trobar el verí en 10 minuts.
fun main() {
    val sc = Scanner(System.`in`)
    repeat(sc.nextInt()) {
        val numPots=sc.nextDouble()
        val ratolins= log(numPots,2.0)
        if (ratolins > (ratolins.toInt()).toDouble()) {
            println(ratolins.toInt()+1)
        }else{
            println(ratolins.toInt())
        }
    }
}