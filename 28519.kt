import java.util.Scanner
import kotlin.math.min

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var x = sc.nextInt()
    var y = sc.nextInt()
    if(x>y){
        println("${2*y+1}")
    }
    else if(x<y){
        println("${2*x+1}")
    }
    else{
        println("${2*x}")
    }
}