package Problemes_14_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val numFiles=sc.nextInt()
    val numColumnes=sc.nextInt()
    val pinzellades=sc.nextInt()
    val files= MutableList(numFiles){false}
    val columnes= MutableList(numColumnes){false}
    repeat(pinzellades){
        if (sc.next()=="R") {
            val y= sc.nextInt()-1
            files[y] = !files[y]
        }else{
            val x= sc.nextInt()-1
            columnes[x] = !columnes[x]
        }
    }
    val filesTrue=files.count{it}
    val colsTrue=columnes.count{it}
    val goldCells=colsTrue*(numFiles-filesTrue)+filesTrue*(numColumnes-colsTrue)
    println(goldCells)
}