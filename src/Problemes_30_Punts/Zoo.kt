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
    val maxDepth=replaceIsland(matriu,0,0,0)
    println(maxDepth)
    sc.close()
}

fun replaceIsland(matriu: Array<CharArray>, row: Int, col: Int, maxDepth:Int):Int {
    val newChar='X'
    var newMaxDepth=maxDepth+1
    val rows = matriu.size
    val cols = matriu[0].size
    var seguentRows=emptyList<Int>()
    var seguentCols=emptyList<Int>()
    val originalChar = matriu[row][col]
    if (originalChar == newChar) return 0
    fun dfs(r: Int, c: Int) {
        if (r !in 0 until rows || c !in 0 until cols) return
        if (matriu[r][c] != originalChar) {
            if (matriu[r][c]=='T'||matriu[r][c]=='B'){
                seguentRows=seguentRows.plus(r)
                seguentCols=seguentCols.plus(c)
                return
            }else{
                return
            }
        }

        matriu[r][c] = newChar

        dfs(r + 1, c)
        dfs(r - 1, c)
        dfs(r, c + 1)
        dfs(r, c - 1)
    }

    dfs(row, col)
    for (i in seguentCols.indices){
        val possible=replaceIsland(matriu,seguentRows[i],seguentCols[i],maxDepth+1)
        if (possible > newMaxDepth){
            newMaxDepth=possible
        }
    }
    return newMaxDepth
}

fun comprovarMatriu(matriu: Array<CharArray>){
    for (x in matriu){
        println(x.joinToString(" "))
    }
}