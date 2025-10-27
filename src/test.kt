import java.util.*

fun main() {
    val matrix= Array(5000000){false}
    var contador=0
    for (i in matrix.indices){
        contador++
        if(contador%1000000==0){
            println(contador)
        }
    }
}