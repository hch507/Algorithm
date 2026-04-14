import java.io.BufferedReader
import java.io.InputStreamReader


var n = 0
var m = 0
lateinit var result : IntArray
val sb = StringBuilder()
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m= input[1]
    result = IntArray(m)
    solution(0,1)
    
    print(sb)

}

fun solution(depth : Int, start : Int){
    if (depth==m){
        sb.append(result.joinToString(" ")).append("\n")
        return
    }

    for (i in start..n){
        result[depth] = i
        solution(depth+1, i+1)
    }
}
