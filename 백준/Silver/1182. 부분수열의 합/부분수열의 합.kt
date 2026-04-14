import java.io.BufferedReader
import java.io.InputStreamReader

var n = 0
var s = 0
lateinit var list : IntArray
var count = 0
fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().split(" ").map { it.toInt() }
    list = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    n = input[0]
    s = input[1]

    solution(0,0)
    if (s==0) count--
    print(count)
}

fun solution(depth : Int, sum:Int){
    if (depth==n){
        if (sum==s){
            count++
        }
        return
    }

    solution(depth+1, sum+ list[depth])

    solution(depth+1, sum)
}
