import java.util.Scanner

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    if(a>b){
        print(">")
    }
    else if(a<b){
        print("<")
    }
    else{
        print("==")
    }
}