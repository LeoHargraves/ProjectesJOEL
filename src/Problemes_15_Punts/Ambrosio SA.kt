package Problemes_15_Punts

import java.util.*
import kotlin.math.abs
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)
    val casos = sc.nextInt()
    repeat(casos) {
        val n=sc.nextInt()
        val center=n/2
        val rings=center+1
        val ringMin = IntArray(rings) { Int.MAX_VALUE }
        val ringMax = IntArray(rings) { Int.MIN_VALUE }

        for (y in 0 until n) {
            for (x in 0 until n) {
                val input = sc.nextInt()
                val r = max(abs(y - center), abs(x - center))
                if (input < ringMin[r]){
                    ringMin[r] = input
                }
                if (input > ringMax[r]){
                    ringMax[r] = input
                }
            }
        }
        var ok = true
        for (r in 0 until rings - 1) {
            if (ringMax[r] >= ringMin[r + 1]) {
                ok = false
            }
        }
        if (ok){
            println("OK")
        } else {
            println("NO")
        }
    }
}