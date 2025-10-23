import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val numOcells=sc.nextInt()
    val ocells= IntArray(numOcells){sc.nextInt()}.toMutableList()
    var numGabies=0
    while (ocells.isNotEmpty()){
        var alssadaGabia=ocells.first()
        var ocellsIndex=0
        while (ocellsIndex<ocells.size){
            if (alssadaGabia==ocells.get(ocellsIndex)){
                print("${ocells[ocellsIndex]} ")
                ocells.removeAt(ocellsIndex)
                alssadaGabia--
            }else{
                ocellsIndex++
            }
        }
        println()
        println(ocells)
        numGabies++
    }
    println(numGabies)
}