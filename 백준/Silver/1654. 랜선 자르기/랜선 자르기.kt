import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = br.readLine().split(" ").map{it.toInt()}

    val n = IntArray(a)

    repeat(a){ i ->
        n[i] = br.readLine().toInt()
    }

    val result = solution(n,b)
    print(result)
}

fun solution(arr : IntArray, target:Int):Int{
    var left = 1L
    var right = arr.maxOrNull()!!.toLong()
    var answer = 0L
    while (left<=right){
        var sum =0L
        val mid = (left+right)/2

        for(i in arr){
            val gap=i.toLong()/mid
            sum+=gap
        }

        if (sum>=target){
            answer=mid
            left=mid + 1
        }else{
            right= mid -1
        }
    }
    return answer.toInt()
}

