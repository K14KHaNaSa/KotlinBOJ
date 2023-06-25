import java.util.Scanner
import java.io.*

fun main(){
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))
    var sc : Scanner = Scanner(System.`in`)
    var n = br.read()
    for(i in 1..20000){
        bw.write("? 1\n")
        bw.flush()
        var ans = sc.nextLine()
        if(ans=="Y"){
            bw.write("! 1")
            bw.flush()
            bw.close()
            break
        }
    }
}