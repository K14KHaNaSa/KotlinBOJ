import java.util.Scanner

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = sc.nextInt()
    if(a>=b && a>=c){
        if(b>=c){
            print(b)
        }
        else{
            print(c)
        }
    }
    else if(b>=a && b>=c){
        if(a>=c){
            print(a)
        }
        else{
            print(c)
        }
    }
    else if(c>=a && c>=b){
        if(a>=b){
            print(a)
        }
        else{
            print(b)
        }
    }
}