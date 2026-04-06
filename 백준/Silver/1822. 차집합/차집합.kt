import java.io.BufferedReader
import java.io.InputStreamReader



fun main(){

    val br= BufferedReader(InputStreamReader(System.`in`))

    val(n, m) = br.readLine().split(" ").map{it.toInt()}

    val listA = br.readLine().split(" ").map{it.toInt()}

    val listB = br.readLine().split(" ").map{it.toInt()}.sorted()

    val result = mutableListOf<Int>()

    for(i in listA){

        val num = binarySearchSolution(listB,i)

        if (num ==-1){
            result.add(i)
        }
    }

    if (result.isNotEmpty()){
        println(result.size)
        println(result.sorted().joinToString(" "))
    }else{
        print(0)
    }

}

fun binarySearchSolution(list : List<Int>, target : Int):Int{

    var left = 0
    var right = list.size-1
    

    while (left<=right){

        var mid = (left+right)/2
        if (list[mid]==target) return mid
        else if(list[mid]<target) left=mid+1
        else right=mid-1

    }

    return -1

}