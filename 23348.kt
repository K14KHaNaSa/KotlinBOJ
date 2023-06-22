import java.util.Scanner
import kotlin.math.*

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var x = sc.nextInt()
    var y = sc.nextInt()
    var z = sc.nextInt()
    var n = sc.nextInt()
    var ans : Int = 0
    for(i in 1..n) {
        var team : Int = 0
        for(j in 1..3){
            var a = sc.nextInt()
            var b = sc.nextInt()
            var c = sc.nextInt()
            team += (a * x) + (b * y) + (c * z)
        }
        ans = max(ans, team)
    }
    println("$ans")
}