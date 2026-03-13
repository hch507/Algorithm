import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n,m) = br.readLine().split(" ").map { it.toInt() }
    var listN = br.readLine().split(" ").map { it.toInt() }

    var answer = solution(listN, m)
    print(answer)
}

fun solution(listN : List<Int>,m : Int):Long{
    var left = 0L
    var right = listN.maxOrNull()!!.toLong()
    var answer = 0L

    while (left<=right){
        var sum = 0L
        val mid = (left+right) /2

        for(tree in listN){
            if(tree>mid){
                sum+=tree - mid
            }
        }

        if (sum >= m) {
            answer = mid
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    return answer
}

