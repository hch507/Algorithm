import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

var m =0
var n = 0
var answer = 0
lateinit var  list : IntArray
fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))

    val input = br.readLine().split(" ").map{it.toInt()}
    n = input[0]
    m = input[1]
    list = br.readLine().split(" ").map{it.toInt()}.toIntArray()
    solution(0,0,0)

    print(answer)
}

fun solution(depth : Int, sum : Int,start : Int) {

    if (depth==3){
        if (sum <= m) {
            answer = max(answer, sum)
        }
        return
    }


    for (i in start until n){
        solution(depth+1,sum+list[i],i+1)
    }
}