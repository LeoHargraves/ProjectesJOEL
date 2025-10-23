package Problemes_30_Punts

import java.util.Scanner

fun main() {
    val sc= Scanner(System.`in`)
    val maxDepth=replaceIsland('T',0,0,1)


    sc.close()
}

fun replaceIsland(grid: Array<CharArray>, row: Int, col: Int,maxDepth:Int) {
    val newChar='X'
    val rows = grid.size
    val cols = grid[0].size
    val originalChar = grid[row][col]

    if (originalChar == newChar) return

    fun dfs(r: Int, c: Int) {
        if (r !in 0 until rows || c !in 0 until cols) return
        if (grid[r][c] != originalChar) {
            if (grid[r][c]=='T'||grid[r][c]=='B'){
                replaceIsland(grid,r,c)
            }
        }else{
            return
        }

        grid[r][c] = newChar

        dfs(r + 1, c)
        dfs(r - 1, c)
        dfs(r, c + 1)
        dfs(r, c - 1)
    }

    dfs(row, col)
}
