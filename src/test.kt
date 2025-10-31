import java.util.*

/*
Hi ha un preu de partida depenent de si és obra nova o bé és un habitatge usat.
Per cada habitació que tingui l’habitatge, s’afegiran un preu fix per habitació.
Si té la cuina o el bany reformats, el pis es revaloritza segons el preu de la reforma, però si els té tots dos s’incrementa 3 vegades el preu de la reforma. Aquestes reformes només són possibles en els habitatges usats.
Si té ascensor la valoració s’incrementa també segons el preu de l'ascensor, però aquest increment mai s’aplica si és un baix (planta 0) i s’incrementa només la meitat si és un primer o un segon pis.
Si l'habitatge cal pintar-lo, es decrementa el preu en un percentatge de pintura i si està moblat s’incrementa el preu en un altre percentatge de mobles.
 */

fun main() {
    val sc= Scanner(System.`in`).useLocale(Locale.UK)//Obrim scanner i fem que llegeixi el format 1.0 amb Locale
    //Inicialitzem les constants que ens introdueixen a la primera linia
    val preuBaseHabitatge=sc.nextInt()
    val preuBaseHabitatgeSegonaMa=sc.nextInt()
    val preuHabitacio=sc.nextInt()
    val preuReforma=sc.nextInt()
    val preuAscensor=sc.nextInt()
    val percentatgePintura=sc.nextFloat()
    val percentatgeMobles=sc.nextFloat()

    //Fem un bucle que tracti cada cas i s'acabi quan no detecti més inputs
    while (sc.hasNext()){
        //Inicialitzem el preu total
        var preuTotal=0.0
        //Anem tractant cada cas

        //Preu base
        val usat=sc.next()
        if (usat=="N"){
            preuTotal+=preuBaseHabitatge
        }else{
            preuTotal+=preuBaseHabitatgeSegonaMa
        }

        //Habitacions
        preuTotal+=sc.nextInt()*preuHabitacio

        //Reformes
        val reformaCuina=sc.next()
        val reformaBany=sc.next()
        if (usat=="S"){//Si no és de segona mà no cal fer res
            if (reformaCuina=="S"&&reformaBany=="S"){
                preuTotal+=preuReforma*3
            }else if (reformaCuina=="S"||reformaBany=="S"){
                preuTotal+=preuReforma
            }
        }

        //Ascensor
        val teAscensor=sc.next()
        if (teAscensor=="S"){
            val pis=sc.nextInt()
            if (pis in 1..2){
                preuTotal+=preuAscensor/2
            }
            if (pis>2){
                preuTotal+=preuAscensor
            }
        }


        //Pintura
        val pintat=sc.next()
        if (pintat=="S"){
            preuTotal-=percentatgePintura/100*preuTotal
        }

        //Mobles
        val amoblat=sc.next()
        if (amoblat=="S"){
            preuTotal+=percentatgeMobles/100*preuTotal
        }

        println(preuTotal)

    }
    sc.close()//Tanquem scanner
}