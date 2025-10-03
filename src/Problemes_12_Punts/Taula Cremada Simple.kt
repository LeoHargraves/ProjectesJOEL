package Problemes_12_Punts

import java.util.Scanner

fun main() {
    val sc= Scanner(System.`in`)
    sc.nextLine()
    val line1=sc.nextLine().split(" ")
    val line2=sc.nextLine().split(" ")
    var previous=false
    var output=0
    for (tacat in line1){
        if (tacat=="1"){
            if (previous){
                output++
            }else{
                previous=true
                output+=3
            }
        }else{
            previous=false
        }
    }
    val infectedCrossroads=theRadiance(line1,line2)
    for (tacat in infectedCrossroads){
        if (tacat=="1"){
            output+=3
        }
        if (tacat=="2"){
            output++
        }
    }
    println(output)
}

fun theRadiance(line1: List<String>,line2: List<String>): List<String>{
    val infectedCrossroads2=line2.toMutableList()
    val infectedCrossroads1=line1.toMutableList()
    var contact=mutableListOf<Int>()
    for (i in line2.indices){
        if (i%2==0&&line1[i]=="1"&&line2[i]=="1"){
            infectedCrossroads2[i]="2"
            contact.add(i)
        }
    }
    for (i in contact){
        var spreadingBack=true
        var spreadingFront=true
        var back=i
        var front=i
        if (infectedCrossroads2[i]=="1"){
            while (spreadingBack||spreadingFront){
                if (back==0){
                    spreadingBack=false
                }else{
                    back--
                }
                if (back==line2.size-1){
                    spreadingFront=false
                }else{
                    front++
                }
                if (line2[back]=="1"&&spreadingBack){
                    infectedCrossroads2[back]="2"
                }else{
                    spreadingBack=false
                }
                if (line2[front]=="1"&&spreadingFront){
                    infectedCrossroads2[front]="2"
                }else{
                    spreadingFront=false
                }
            }
        }
    }
    return infectedCrossroads2
}