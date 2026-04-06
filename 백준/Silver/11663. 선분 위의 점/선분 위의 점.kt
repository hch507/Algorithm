import java.io.BufferedReader
import java.io.InputStreamReader



fun main(){

    val br= BufferedReader(InputStreamReader(System.`in`))

    val (n, m) = br.readLine().split(" ").map{it. toInt()}

    val list = br.readLine().split(" ").map{it.toInt()}.sorted()

    repeat(m){
        val (a, b) = br.readLine().split(" ").map { it.toInt() }

        val result = upperBound(list,b)- lowerBound(list,a)
        
        println(result)
    }

}

fun lowerBound(list: List<Int>, target : Int): Int{
    var left = 0
    var right = list.size

    while (left<right){
        val mid = (left+right)/2

        if (list[mid]<target) left =mid+1
        else right = mid
    }

    return left
}

fun upperBound(list : List<Int>, target : Int):Int {
    var left = 0
    var right = list.size

    while (left<right){
        val mid = (left+right)/2

        if (list[mid]<=target) left =mid+1
        else right = mid
    }

    return left
}