import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val listN = br.readLine().split(" ").map { it.toInt() }.sorted()
    val m = br.readLine().toInt()
    val listM = br.readLine().split(" ").map{it.toInt()}

    val sb = StringBuilder()
    for( i in listM){
        val count = upperBound(listN,i) - lowerBound(listN, i)
        sb.append(count).append(" ")
    }

    println(sb)

}

fun lowerBound(list : List<Int>, target: Int) : Int{
    var left = 0
    var right = list.size

    while (left < right){
        val mid = (left + right) /2

        if (list[mid] < target ){
            left = mid+1
        }else{
            right = mid
        }
    }

    return left
}


fun upperBound(list : List<Int>, target : Int ) : Int{
    var left = 0
    var right = list.size

    while (left < right){
        val mid = (left + right) / 2

        if (list[mid] <= target ){
            left = mid+1
        }else{
            right = mid
        }
    }

    return left
}