package Problemes_6_Punts

import java.util.Scanner

fun main() {
    val abecedario="abcdefghijklmnñopqrstuvwxyz"
    val sc= Scanner(System.`in`)
    val rep=sc.nextInt()
    sc.nextLine()
    var output="SI"
    if (rep==0){
        output="NO"
    }
    for (i in 0..<rep){
        if (sc.nextLine().first()!=abecedario[i]){
            output="NO"
        }
    }
    println(output)
}
/*
import java.util.*
fun deAccent(str: String): String {
    val accents = mapOf('á' to 'a', 'é' to 'e', 'í' to 'i', 'ó' to 'o', 'ú' to 'u', 'Á' to 'A','À' to 'A', 'É' to 'E', 'Í' to 'I', 'Ó' to 'O','Ò' to 'O', 'Ú' to 'U')
    return str.map { accents[it] ?: it }.joinToString("")
}
fun main() {
    val scanner = Scanner(System.`in`)
    // Leer el número de casos
    val casos = scanner.nextInt()
    scanner.nextLine()
    repeat(casos) {
        var miembros = deAccent(scanner.nextLine().uppercase()).split(", ")
        var ultimomiembro = miembros.last()
        var ultimonombre = ultimomiembro.split(" I ").last()
        for (miembro in miembros) {
            print(miembro.first())
        }
        println(ultimonombre.first())
    }
}
 */