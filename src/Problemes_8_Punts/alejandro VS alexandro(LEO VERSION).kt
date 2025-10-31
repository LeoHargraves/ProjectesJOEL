package Problemes_8_Punts
/*
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val linies=sc.nextInt()
        sc.nextLine()
        val nodes=mutableMapOf<String, MutableList<String>>()
        repeat(linies){
            val (node,valor)=sc.nextLine().split(" -> ")
            if (nodes.contains(node)){
                nodes[node]!!.add(valor)
            }else{
                nodes[node] = mutableListOf(valor)
            }
        }
        val wanted=sc.nextLine()
        val numPeli=buscarPelicula(nodes,nodes["marvel"]!!,wanted,0)
        println(numPeli.numPeli)
    }
    sc.close()
}

fun buscarPelicula(nodes: MutableMap<String,MutableList<String>>, node: MutableList<String>, wanted: String, numPeli:Int): Alejandro{
    var output= Alejandro(0,true)
    if (node.contains(wanted)){
        while (output.isActive&&output.numPeli<node.size){
            if (node[output.numPeli]==wanted){
                output.isActive=false
            }
            output.numPeli++
        }
    }else{
        output.numPeli=node.size
        for (x in node){
            if (nodes.contains(x)&&output.isActive){
                val new=buscarPelicula(nodes,nodes[x]!!,wanted,0)
                output.numPeli+=new.numPeli
                output.isActive=new.isActive
            }
        }
    }
    return output
}

class Alejandro(var numPeli: Int, var isActive: Boolean)
*/