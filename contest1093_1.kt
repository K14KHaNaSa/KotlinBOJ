import java.util.Scanner

fun main() {
    var sc: Scanner = Scanner(System.`in`)
    var h = sc.nextInt()
    var i = sc.nextInt()
    var a = sc.nextInt()
    var r = sc.nextInt()
    var c = sc.nextInt()
    println("${h * i - a * r * c}")
}