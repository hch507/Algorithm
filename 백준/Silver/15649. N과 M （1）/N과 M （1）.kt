import java.io.BufferedReader
import java.io.InputStreamReader

var n = 0
var m = 0
lateinit var result : IntArray
val sb = StringBuilder()
lateinit var visited : BooleanArray

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))

    val input = br.readLine().split(" ").map { it.toInt() }

    n = input[0]
    m = input[1]
    result = IntArray(m)
    visited = BooleanArray(n+1)

    solution(0)
    print(sb)
}

fun solution(depth : Int){

    if (depth==m){
        sb.append(result.joinToString(" ")).append("\n")
        return
    }
    for (i in 1..n){
        if (visited[i]) continue

        visited[i] = true
        result[depth] = i
        solution(depth + 1)
        visited[i]=false
    }
}

