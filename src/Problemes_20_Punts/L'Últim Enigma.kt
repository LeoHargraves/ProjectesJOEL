package Problemes_20_Punts

//Per cada cas de prova es respondrà:
//
//SI quan sigui possible construir dues files amb els números donats de tal manera que el sumatori dels valors
// de la fila1 i els sumatori dels valors de la fila2 tingui una diferència d’ 1
//
//NO cas contrari

import java.util.Scanner

val sc = Scanner(System.`in`)

fun main() {
    repeat(sc.nextLine().toInt()) {
        val n=sc.nextInt()
        val input= IntArray(n){sc.nextInt()}
        val nums= treureZeros(input)

        val sumatori=nums.sum()

        if (sumatori%2==0){
            println("NO")
        }else{
            if (potsFerNumero(nums,sumatori/2+1)){
                println("SI")
            }else{
                println("NO")
            }
        }
    }
    sc.close()
}

fun potsFerNumero(nums: IntArray, objectiu:Int): Boolean{
    val sumes=BooleanArray(objectiu+1){false}
    sumes[0] = true

    for (num in nums){
        for(sum in objectiu downTo num){
            if (sumes[sum-num]){
                sumes[sum] = true
            }
        }
    }



    return  sumes[objectiu]||sumes[objectiu-1]
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