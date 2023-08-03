import java.util.Scanner

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var q1 = 0
    var q2 = 0
    var q3 = 0
    var q4 = 0
    var ax = 0
    for(i in 1..n){
        var xi = sc.nextInt()
        var yi = sc.nextInt()
        if(xi == 0 || yi == 0){
            ax++
        }
        else if(xi > 0){
            if(yi > 0){
                q1++
            }
            else{
                q4++
            }
        }
        else{
            if(yi > 0){
                q2++
            }
            else{
                q3++
            }
        }
    }
    print("Q1: $q1\nQ2: $q2\nQ3: $q3\nQ4: $q4\nAXIS: $ax")
}