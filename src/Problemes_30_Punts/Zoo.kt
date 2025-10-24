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
    val seguentRows=mutableListOf<Int>()
    val seguentCols=mutableListOf<Int>()
    val originalChar = matriu[row][col]
    if (originalChar == newChar) return 0
    fun dfs(r: Int, c: Int) {
        if (r !in 0 until rows || c !in 0 until cols) return
        if (matriu[r][c] != originalChar) {
            if (matriu[r][c]=='T'||matriu[r][c]=='B'){
                seguentRows.add(r)
                seguentCols.add(c)
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
    printColoredGrid(matriu)


    dfs(row, col)
    val opcionsProf=mutableListOf<Int>()
    for (i in 0 until seguentCols.size){
        opcionsProf.add(replaceIsland(matriu,seguentRows[i],seguentCols[i], maxDepth))
    }
    if (opcionsProf.isNotEmpty()){
        newMaxDepth+=opcionsProf.max()
    }
    println("\n$newMaxDepth\n")
    return newMaxDepth
}

fun comprovarMatriu(matriu: Array<CharArray>){
    for (x in matriu){
        println(x.joinToString(" "))
    }
}

fun printColoredGrid(grid: Array<CharArray>) {
    val reset = "\u001B[0m"

    // Helper function for background color (24-bit RGB)
    fun bg(r: Int, g: Int, b: Int) = "\u001B[48;2;${r};${g};${b}m"

    for (row in grid) {
        for (cell in row) {
            val color = when (cell) {
                '*' -> bg(120, 120, 120)  // gray
                'T' -> bg(0, 180, 0)      // green
                'B' -> bg(200, 180, 0)    // yellow
                'X' -> bg(200, 0, 0)      // red
                else -> bg(0, 0, 0)       // black for unknown
            }
            print("$color  $reset")  // two spaces for square shape
        }
        println()
    }
}
