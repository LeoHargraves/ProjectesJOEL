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
        val nums= treureZeros(input)

        val sumatori=nums.sum()

        if (sumatori%2==0){
            println("NO")
        }else{
            if (esCorrecte(nums)){
                println("SI")
            }else{
                println("NO")
            }
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
    var lengthLimit=nums.size/2+1
    for (listLength in 1..lengthLimit){

    }

    return  true
}











