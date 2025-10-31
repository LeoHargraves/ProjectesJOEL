package Problemes_8_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val linies=sc.nextInt()
        sc.nextLine()
        val nodes: MutableMap<String, MutableList<String>> =mutableMapOf(Pair("marvel",mutableListOf<String>()))
        repeat(linies){
            val (valor1,valor2)=sc.nextLine().split(" -> ")
            if (nodes.contains(valor1)){
                nodes[valor1]!!.add(valor2)
            }else if (nodes.contains(valor2)){
                nodes[valor2]!!.add(valor1)
            }else{
                var value1Node=false
                for (node in nodes.values){
                    if (node.contains(valor1)){
                        value1Node=true
                    }
                }
                if (value1Node){
                    nodes[valor1] = mutableListOf(valor2)
                }else{
                    nodes[valor2] = mutableListOf(valor1)
                }
            }
        }
        val wanted=sc.nextLine()
        val queue=mutableListOf("marvel")
        var numVisited=0
        var output=0
        while (queue.isNotEmpty()){
            val queueLength=queue.size
            val addToQueue=mutableListOf<String>()
            for (node in queue){
                if (nodes.contains(node)){
                    for (peli in nodes[node]!!){
                        numVisited++
                        if (peli==wanted){
                            output=numVisited
                        }
                        addToQueue.add(peli)
                    }
                }
            }
            repeat(queueLength){
                queue.removeFirst()
            }
            queue.addAll(addToQueue)
        }
        println(output)

    }
    sc.close()
}

