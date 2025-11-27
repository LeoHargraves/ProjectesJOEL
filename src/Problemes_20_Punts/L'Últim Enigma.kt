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
        val input= IntArray(n){sc.nextInt()}
        input.sortDescending()
        val nums= treureZeros(input)

        val sumatori=nums.sum()

        if (sumatori%2==0){
            println("NO")
        }else{

        }
    }
    sc.close()
}

fun treureZeros(input: IntArray): IntArray{
    var numZeros=0
    for (x in input){
        if (x==0){
            numZeros++
        }
    }

    if (numZeros==0){
        return input
    }

    val nums= IntArray(input.size-numZeros)

    var numsIt=0
    var inputIt=0
    while (inputIt < input.size){
        if (input[inputIt]==0){
            inputIt++
        }else{
            nums[numsIt]=input[inputIt]
            inputIt++
            numsIt++
        }
    }

    return nums
}

fun esCorrecte(nums: IntArray): Boolean{
    var correcte=false
    var llista1=mutableListOf<Int>(nums[0])
    var llista2=mutableListOf<Int>()
    for (i in 1 until nums.size){
        val num=nums[i]
        val sum1=llista1.sum()
        val sum2=llista2.sum()
        if (sum2<sum1){
            
        }
    }

    return  true
}