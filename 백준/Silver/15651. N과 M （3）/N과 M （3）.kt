
import java.io.BufferedReader
import java.io.InputStreamReader

var n =0
var m =0
val sb = StringBuilder()
lateinit var result :IntArray
fun main(){

    var br = BufferedReader(InputStreamReader(System.`in`))

    var input = br.readLine().split(" ").map{it.toInt()}

    n =input[0]
    m =input[1]

    result = IntArray(m)

    solution(0)
    print(sb)
}

fun solution(depth : Int){

    if (depth==m){
        sb.append(result.joinToString(" ")).append("\n")
        return
    }
    for (i in 1..n){
        result[depth] = i
        solution(depth+1)
    }
}

