import java.util.Scanner

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var k = sc.nextInt()
    var ans : Int = 0
    var s : Int
    var y : Int
    var m = Array(6,{0})
    var f = Array(6,{0})
    for(i in 1..n){
        s = sc.nextInt()
        y = sc.nextInt()
        if(s==0){
            f[y-1]++
        }
        else if(s==1){
            m[y-1]++
        }
    }
    for(i in 0..5){
        ans += m[i] / k
        if(m[i]%k>0){
            ans++
        }
        ans += f[i] / k
        if(f[i]%k>0){
            ans++
        }
    }
    println("$ans")
}