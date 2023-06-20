import java.util.Scanner
import kotlin.math.min

fun main(){
    val sc : Scanner = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()
    if((a + b) > (c * 2))
        if(x>y)
            println("${c * min(x,y) * 2 + min(a, c * 2) * (x - min(x,y))}")
        else
            println("${c * min(x,y) * 2 + min(b, c * 2) * (y - min(x,y))}")
    else
        println("${a * x + b * y}")
}