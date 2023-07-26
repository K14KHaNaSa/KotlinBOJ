import java.util.Scanner

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var k = sc.nextInt()
    var ans = 0
    var cnt = 0
    for(i in 1..n){
        if(n%i==0){
            cnt++
            if(cnt==k){
                ans = i
            }
        }
    }
    println("$ans")
}