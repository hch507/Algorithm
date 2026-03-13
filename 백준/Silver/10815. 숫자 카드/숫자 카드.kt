import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val listN = br.readLine().split(" ").map{it.toInt()}.sorted()

    val m=  br.readLine().toInt()
    val lisM =  br.readLine().split(" ").map{it.toInt()}

    var sb = StringBuilder()

    for(i in lisM){
        val result = solution(listN,i)
        if (result !=-1){
            sb.append("${result} ")
        }else{
            sb.append("0 ")
        }
    }
    print(sb)
}


fun solution(listN : List<Int>, target : Int):Int{
    var left = 0
    var right = listN.size-1

    while (left<=right){
        val mid = (left+right) / 2
        
        if (listN[mid]==target) return 1
        else if(listN[mid]<target){
            left =mid+1
        }else{
            right=mid-1
        }
    }
    return -1

}

