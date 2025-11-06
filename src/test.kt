import java.util.*

fun main() {
    var coincidencias=listOf(mutableListOf<String>(),mutableListOf<String>(),mutableListOf<String>())
    for (x in coincidencias){
        x.add("x")
    }
    for (x in coincidencias){
        println(x.joinToString(" "))
    }
}