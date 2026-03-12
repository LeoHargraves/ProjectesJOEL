package Problemes_30_Punts

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val length=sc.nextInt()
    var jo=sc.nextInt()
    var gangplank=jo
    val cilindres=sc.next()
    var guanyador="GANGPLANK"
    var indexPrincipi=0
    var indexFinal=length-1
    var tornGangplank=true
    while (gangplank>0&&0<jo) {
        var videsJugadorActual=jo
        var videsAltreJugador=gangplank
        if (tornGangplank){
            videsJugadorActual=gangplank
            videsAltreJugador=jo
        }

        if (cilindres[indexPrincipi]=='P'){
            indexPrincipi++
        }else if (cilindres[indexFinal]=='P'){
            indexFinal--
        }else if(morMenorEnVides(cilindres,indexPrincipi, indexFinal,gangplank,jo)){
            if (jo<gangplank||(jo==gangplank&&!tornGangplank)){
                jo=0
            }else{
                gangplank=0
            }
        }else{
            if (tornGangplank){
                gangplank--
            }else{
                jo--
            }
            if (illaImparella(cilindres,indexPrincipi)){
                indexFinal--
            }else{
                indexPrincipi++
            }
        }
        tornGangplank=!tornGangplank
    }
    if (gangplank==0){
        guanyador="JO"
    }
    println(guanyador)
    sc.close()
}


fun illaImparella(cilindres:String,index:Int):Boolean{
    var result=true
    var i=1
    while (cilindres[index+i]=='P'){
        i++
    }
    if (i%2==0){
        result=false
    }
    return result
}


fun morMenorEnVides(cilindres:String,start:Int,end:Int,v1:Int,v2:Int):Boolean{
    var mortSegura=true
    var distance=v1
    if (v2<v1){
        distance=v2
    }
    var i=start
    while (mortSegura&& i in start until start + distance) {
        if (cilindres[i] == 'P') {
            mortSegura = false
        }
        i++
    }
    i=end
    while (mortSegura&& i in end downTo  end - distance-1) {
        if (cilindres[i]=='P'){
            mortSegura=false
        }
        i--
    }
    return mortSegura
}