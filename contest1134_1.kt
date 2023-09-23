import java.util.Scanner

fun main() {
    var sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    for(i in 1..n){
        var a = sc.nextInt()
        var b = sc.nextInt()
        var x = sc.nextInt()
        println("${a*(x-1) + b}")
    }
}