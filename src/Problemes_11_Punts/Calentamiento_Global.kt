package Problemes_11_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    while (true) {
        val n=sc.nextInt()
        if (n==0){
            break
        }
        val temps=IntArray(n){
            sc.nextInt()
        }
        if (n==1) {
            println(0)
            continue
        }
        val m = n - 1
        val diffs = IntArray(m) { i -> temps[i + 1] - temps[i] }
        var cycleLength = m
        for (k in 1..m) {
            var ok = true
            for (i in 0 until m) {
                if (diffs[i] != diffs[i % k]) {
                    ok = false
                    break
                }
            }
            if (ok) {
                cycleLength = k
                break
            }
        }
        println(cycleLength)
    }
}
