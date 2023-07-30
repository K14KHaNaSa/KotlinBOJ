import java.util.Scanner

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var x = sc.nextInt()
    var l = sc.nextInt()
    var r = sc.nextInt()

    if(x<l){
        println("$l")
    }
    else if(x>r){
        println("$r")
    }
    else{
        println("$x")
    }
}