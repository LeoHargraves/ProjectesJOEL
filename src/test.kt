import Problemes_19_Punts.checkLines
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val N=sc.nextInt()
    val matriu = Array(N) { IntArray(N){sc.nextInt()} }
    for (toCenter in 0 until N/2){
        println(checkLines(matriu,toCenter))
    }
}