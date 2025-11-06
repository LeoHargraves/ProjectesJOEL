package Problemes_15_Punts

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val casos=sc.nextInt()
    repeat(casos){
        val tamany=sc.nextInt()
        val matriu=Array(tamany){Array(tamany){sc.nextInt()}}
        val center=tamany/2
        var dades=Dades(matriu[center][center],matriu[center][center],true)
        for (layer in 1..center) {
            val start = center - layer
            val end = center + layer

            for (c in start..end) {
                dades=comprovar(matriu,dades,start,c)
            }
            for (r in start + 1..end) {
                dades=comprovar(matriu,dades,r, end)
            }
            for (c in end - 1 downTo start) {
                dades=comprovar(matriu,dades,end, c)
            }
            for (r in end - 1 downTo start + 1) {
                dades=comprovar(matriu,dades,r, start)
            }
            dades=dades.update()
        }
        if (dades.out){
            println("OK")
        }else{
            println("NO")
        }
    }
    sc.close()
}

fun comprovar(matriu:Array<Array<Int>>,dades:Dades, x:Int, y:Int):Dades{
    var output=dades
    if (matriu[x][y]<=dades.ant){
        output= dades.over()
    }
    if (matriu[x][y]>output.act){
        output=output.max(matriu[x][y])
    }
    return output
}

class Dades(anterior:Int,actual:Int,output:Boolean){
    val ant=anterior
    val act=actual
    val out=output
    fun update():Dades{
        return Dades(act,act,out)
    }

    fun max(new:Int):Dades{
        return Dades(ant,new,out)
    }

    fun over():Dades{
        return Dades(ant,act,false)
    }
}