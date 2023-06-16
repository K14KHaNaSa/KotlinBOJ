import java.util.Scanner

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var n = sc.nextInt()

    for(i in 1..9)
        println("$n * $i = ${n*i}")
}