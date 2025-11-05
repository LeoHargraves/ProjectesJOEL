import java.util.*

fun main() {
    val sc= Scanner(System.`in`)
    var count=0.0
    var t=100.0
    while (t>1) {
        t*=0.5
        count++
    }
    println(100.0/count*2)
}