package Problemes_30_Punts

import java.util.Scanner

fun main() {
    val sc= Scanner(System.`in`)
    var matriu=emptyArray<CharArray>()
    val rows=sc.nextInt()
    val cols=sc.nextInt()
    sc.nextLine()
    repeat(rows) {
        val line = sc.nextLine()
        matriu += line.toCharArray()
    }
    printColoredGrid(matriu)
    println(countDepth(matriu))
    sc.close()
}

fun countDepth(matriu:Array<CharArray>):Int{
    var paintNext=matriu[0][0]
    var profundidad=0
    while (paintNext=='T'||paintNext=='B'){
        paintNext=replaceBoard(matriu, if (profundidad % 2 == 0) '0' else '1',paintNext)
        profundidad++
    }
    return profundidad
}

fun replaceBoard(matriu: Array<CharArray>, newChar:Char, animalActual: Char): Char {
    val rows = matriu.size
    val cols = matriu[0].size
    var paintNext='X'
    var altreAnimal='T'
    var oldChar='0'
    if (newChar=='0'){
        oldChar='1'
    }
    if (animalActual=='T'){
        altreAnimal='B'
    }

    fun dfs(r: Int, c: Int) {
        if (r !in 0 until rows || c !in 0 until cols) return
        if (matriu[r][c] == altreAnimal) {
            paintNext=altreAnimal
            return
        }
        if (matriu[r][c] == animalActual||matriu[r][c] == oldChar){
            matriu[r][c] = newChar

            dfs(r + 1, c)
            dfs(r - 1, c)
            dfs(r, c + 1)
            dfs(r, c - 1)
        }else{
            return
        }
    }

    dfs(0, 0)
    printColoredGrid(matriu)
    println()
    return paintNext
}
