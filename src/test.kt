import Problemes_19_Punts.checkLines
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n=sc.nextInt()
    val matriu= Array(n){ CharArray(n) }
    for (y in matriu.indices){
        for (x in matriu[y].indices){
            val int=sc.nextInt()
            if (int==13){
                matriu[y][x]='x'
            }else{
                matriu[y][x]='o'
            }
        }
    }
    println()
    for (line in matriu){
        println(line.joinToString(" | "))
        println("____________________________________________")
    }
}