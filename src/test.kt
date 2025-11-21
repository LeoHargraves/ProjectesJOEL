import java.util.Scanner

//Per a cada cas hauràs de dir la posició final després de les 3 tirades de daus, tenint en compte
// que si algún cop arrives a l’última casella (8) ja has guanyat i la resta de tirades son irrelevants

fun main() {
    //Inicialitzem Scanner
    val sc= Scanner(System.`in`)
    //Ens guardem quants casos hi ha i fem un bucle
    val casos=sc.nextInt()
    repeat(casos){
        var posicio=sc.nextInt() //Posició inicial
        val tirades= Array(3){sc.nextInt()}//Array amb les tirades
        var bucle=true//Valor per saber si hem de ser al bucle
        var i=0//Iterador de tirades
        while (bucle&&i<3){
            val desplassamentAbsolut=posicio+tirades[i]//El desplaçament que faria la fitxa si estigués a la pos 0
            if (desplassamentAbsolut==8){//Si arriba exacte al 8 es surt del bucle
                bucle=false
                posicio=8
            }else{
                posicio=desplassamentAbsolut//Bastant evident
                if (posicio>8){//Si es passa de 8 exactes
                    posicio=8-(desplassamentAbsolut-8)//Rebota rebota i en tu culo explota(Com explico això? Oh! Math!)
                }
            }
            i++
        }
        println(posicio)//Printejem la posició
    }
    //Tanquem Scanner
    sc.close()
}