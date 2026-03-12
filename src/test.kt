import Problemes_19_Punts.checkLines
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val length=sc.nextInt()
    var jo=sc.nextInt()
    val cilindres=sc.next()
    var simplified=""
    var streak=0
    for(i in 1 until length) {
        if(i==length-1&&cilindres[i-1] == cilindres[i]){
            streak++
        }
        if (cilindres[i-1] == cilindres[i]&&i!=length-1) {
            streak++
        }else{
            if (streak%2==0){
                simplified+=cilindres[i-1]
            }else{
                simplified+="${cilindres[i-1]}${cilindres[i-1]}"
            }
            streak=0
        }
    }
    println(simplified)
}