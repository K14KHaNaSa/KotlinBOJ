import java.util.Scanner

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var x = sc.nextInt()
    var y = sc.nextInt()
    var z = sc.nextInt()
    if(x+y>z){
        println(0)
    }
    else{
        println(1)
    }
}