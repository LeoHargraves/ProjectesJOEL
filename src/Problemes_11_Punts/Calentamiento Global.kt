package Problemes_11_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    while (true){
        val numTemp=sc.nextInt()
        if (numTemp==0){break}
        if (numTemp==1){
            println(0)
        }else{
            var temp=listOf<Int>()
            repeat(numTemp){
                temp=temp.plus(sc.nextInt())
            }
            var canvis=listOf<Int>()
            for (i in 1..<temp.size){
                canvis=canvis.plus(temp[i]-temp[i-1])
            }
            var output=0
            for (llargadaBucle in 1..canvis.size){
                var end=true
                for (i in 0..<canvis.size){
                    if (canvis[i]!=canvis[i%llargadaBucle]){
                        end=false
                    }
                }
                if (output==0&&end){
                    output=llargadaBucle
                }
            }
            println(output)
        }
    }
}