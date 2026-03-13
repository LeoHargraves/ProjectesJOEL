import Problemes_30_Punts.Judge
import Problemes_30_Punts.Pastis
import Problemes_30_Punts.answer
import Problemes_30_Punts.cleanUp
import java.util.*

fun main() {
    test(1)
}

fun test(){
    var pastissos=MutableList<Pastis>(300000){Pastis(Random().nextLong(1,1000000001),Random().nextLong(1,1000000001))}
    pastissos.sortByDescending { it.sabor }
    pastissos= cleanUp(pastissos)
    val x=5
    val y=8
    println("----------------------------------------------------")
    for (pastis in pastissos) {
        println("${pastis.sabor} ${pastis.estetica} = ${pastis.estetica*y+pastis.sabor*x}")
    }
    println("----------------------------------------------------")
}

fun test(int: Int){
    //var pastissos=MutableList<Pastis>(300000){Pastis(Random().nextLong(1,1000000001),Random().nextLong(1,1000000001))}
    //val judges= Array(30){ Judge(Random().nextInt(1,1000000001),Random().nextInt(1,1000000001))}
    var pastissos=mutableListOf(Pastis(1,10),Pastis(8,2))
    val judges= arrayOf(Judge(10,1), Judge(1,10))
    pastissos.sortByDescending { it.sabor }
    pastissos= cleanUp(pastissos)
    for (judge in judges) {
        println("----------------------------------------------------")
        val x=judge.sabor
        val y=judge.estetica
        for (pastis in pastissos) {
            println("${pastis.sabor} ${pastis.estetica} = ${pastis.estetica*y+pastis.sabor*x}")
        }
        println()
        ans(pastissos,judge)
        println("----------------------------------------------------")
    }
}

fun ans(pastissos: MutableList<Pastis>, judge: Judge){
    var buscant=true
    var max=pastissos.size-1
    var min=0
    while (buscant){
        val i=(max-min)/2+min
        val S=pastissos[i].sabor
        val E=pastissos[i].estetica
        val punts=S*judge.sabor+E*judge.estetica
        if (i==0){
            val up=pastissos[i+1]
            val puntsUp=up.sabor*judge.sabor+up.estetica*judge.estetica
            if (puntsUp>punts){
                min=1
            }else{
                max=0
            }
        }else{
            val down=pastissos[i-1]
            val puntsDown=down.sabor*judge.sabor+down.estetica*judge.estetica
            val up=pastissos[i+1]
            val puntsUp=up.sabor*judge.sabor+up.estetica*judge.estetica
            if (puntsDown>punts){
                max=i-1
            }else if (puntsUp>punts){
                min=i+1
            }else{
                min=i
                max=i
            }
        }

        if (max==min){
            buscant=false
        }
    }
    val S=pastissos[min].sabor
    val E=pastissos[min].estetica
    println(S*judge.sabor+E*judge.estetica)
}