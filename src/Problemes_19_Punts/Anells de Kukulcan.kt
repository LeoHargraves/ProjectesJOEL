package Problemes_19_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val N=sc.nextInt()

    val matriu = Array(N) { IntArray(N){sc.nextInt()} }

    var portaFalsa=true
    for (toCenter in 0 until N/2){
        var linePresent=checkLines(matriu,toCenter)
        if (linePresent){
            for (circle in 0 until N/2){
                linePresent=checkCombination(matriu,circle,toCenter)
            }
        }
        if (linePresent){
            portaFalsa=false
        }
    }

    if (portaFalsa){
        println("NO")
    }else{
        println("SI")
    }

    sc.close()
}

fun checkLines(matriu:Array<IntArray>,toCenter: Int): Boolean{
    var linePresent=true
    for (i in toCenter until matriu[0].size-toCenter){
        if (matriu[toCenter][i]!=13){
            linePresent=false
        }
    }
    if (!linePresent){
        for (i in toCenter until matriu[0].size-toCenter){
            if (matriu[matriu.size-1-toCenter][i]!=13){
                linePresent=false
            }
        }
    }
    if (!linePresent){
        for (i in toCenter until matriu[0].size-toCenter){
            if (matriu[i][toCenter]!=13){
                linePresent=false
            }
        }
    }
    if (!linePresent){
        for (i in toCenter until matriu[0].size-toCenter){
            if (matriu[i][matriu.size-1-toCenter]!=13){
                linePresent=false
            }
        }
    }

    return linePresent
}

fun checkCombination(matriu:Array<IntArray>, circle: Int, possibleCircle:Int): Boolean{
    var linePresent=true

    if (matriu[possibleCircle][circle]!=13||matriu[possibleCircle][matriu.size-1-circle]!=13){
        linePresent=false
    }

    if (!linePresent){
        if (matriu[matriu.size-1-possibleCircle][circle]!=13||matriu[matriu.size-1-possibleCircle][matriu.size-1-circle]!=13){
            linePresent=false
        }
    }
    if (!linePresent){
        if (matriu[circle][possibleCircle]!=13||matriu[matriu.size-1-circle][possibleCircle]!=13){
            linePresent=false
        }
    }
    if (!linePresent){
        if (matriu[circle][matriu.size-1-possibleCircle]!=13||matriu[matriu.size-1-circle][matriu.size-1-possibleCircle]!=13){
            linePresent=false
        }
    }
    return linePresent
}