import java.util.Scanner

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var answer = 1
    for(i in 1..n){
        answer = (answer + 1 + (i * 3)) % 45678
    }
    println("$answer")
}