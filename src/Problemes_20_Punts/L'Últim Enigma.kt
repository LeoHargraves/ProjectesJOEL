package Problemes_20_Punts

//Per cada cas de prova es respondrà:
//
//SI quan sigui possible construir dues files amb els números donats de tal manera que el sumatori dels valors
// de la fila1 i els sumatori dels valors de la fila2 tingui una diferència d’ 1
//
//NO cas contrari

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    repeat(sc.nextLine().toInt()) {
        val n=sc.nextInt()
        val nums= IntArray(n){sc.nextInt()}.toMutableList()
        for (x in nums){
            if (x==0){
                nums.remove(0)
            }
        }
        val suma=nums.sum()
        if (suma%2==0){
            println("NO")
        }else{
            allCombinations(nums)
        }
    }
    sc.close()
}

fun <T> allCombinations(list: List<T>): List<List<T>> {
    val result = mutableListOf<List<T>>()
    val n = list.size

    for (i in 0 until (1 shl n)) { // 2^n combinations
        val combo = mutableListOf<T>()
        for (j in 0 until n) {
            if (i and (1 shl j) != 0) combo.add(list[j])
        }
        result.add(combo)
    }

    return result
}