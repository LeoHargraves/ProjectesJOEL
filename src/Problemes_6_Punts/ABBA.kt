package Problemes_6_Punts

import java.util.Scanner
import java.text.Normalizer

fun main() {
    val sc= Scanner(System.`in`)
    val rep=sc.nextInt()
    sc.nextLine()
    repeat(rep){
        var acronim=""
        val input=sc.nextLine()
        val names=input.split(Regex(", | i "))
        for (name in names){
            acronim+=name.first()
        }
        println(normalizeToUpperCase(acronim))
    }
}


fun normalizeToUpperCase(input: String): String {
    val normalized = Normalizer.normalize(input, Normalizer.Form.NFD)
    val protected = normalized
        .replace("ñ", "##ñ##")
        .replace("Ñ", "##Ñ##")
        .replace("ç", "##ç##")
        .replace("Ç", "##Ç##")
    val withoutDiacritics = protected.replace("\\p{M}+".toRegex(), "")
    val restored = withoutDiacritics
        .replace("##ñ##", "Ñ")
        .replace("##Ñ##", "Ñ")
        .replace("##ç##", "Ç")
        .replace("##Ç##", "Ç")
    return restored.uppercase()
}