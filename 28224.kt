import java.util.Scanner

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var ans = 0
    for(i in 1..n){
        var p = sc.nextInt()
        ans += p
    }
    println("$ans")
}