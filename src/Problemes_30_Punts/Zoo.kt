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

fun replaceIsland(grid: Array<CharArray>, row: Int, col: Int,maxDepth:Int):Int {
    val newChar='X'
    var newMaxDepth=maxDepth+1
    val rows = grid.size
    val cols = grid[0].size
    val originalChar = grid[row][col]
    if (originalChar == newChar) return 0
    fun dfs(r: Int, c: Int) {
        if (r !in 0 until rows || c !in 0 until cols) return
        if (grid[r][c] != originalChar) {
            if (grid[r][c]=='T'||grid[r][c]=='B'){
                val possible=replaceIsland(grid,r,c,newMaxDepth)
                if (possible > newMaxDepth){
                    newMaxDepth=possible
                }
            }else{
                return
            }
        }

        grid[r][c] = newChar

        dfs(r + 1, c)
        dfs(r - 1, c)
        dfs(r, c + 1)
        dfs(r, c - 1)
    }

    dfs(row, col)
    comprovarMatriu(grid)
    println()
    return newMaxDepth
}

fun comprovarMatriu(matriu: Array<CharArray>){
    for (x in matriu){
        println(x.joinToString(" "))
    }
}