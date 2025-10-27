package Problemes_12_Punts

import java.util.*


fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val matriu= Array(9){Array(9){sc.nextInt()}}
        var sudoku=true
        for (i in matriu.indices){
            if (matriu[i].sum()!=45){
                sudoku=false
            }
            var sumCol=0
            for (line in matriu){
                sumCol+=line[i]
            }
            if (sumCol!=45){
                sudoku=false
            }
        }
        for (x in 0..6 step(3)){
            for (y in 0..6 step(3)){
                var sumSquare=0
                val boxLine=matriu.copyOfRange(y,y+3)
                for (line in boxLine){
                    for (i in 0..2){
                        sumSquare+=line[i]
                    }
                }
                if (sumSquare!=45){
                    sudoku=false
                }
            }
        }
        println(sudoku)
    }
    sc.close()
}