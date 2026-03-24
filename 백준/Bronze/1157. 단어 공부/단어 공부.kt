
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
   val br = BufferedReader(InputStreamReader(System.`in`))

    val input = br.readLine().toString().uppercase()

    val map = mutableMapOf<String, Int>()
    var sum = 0
    var result = ""

    for(i in input){
        map[i.toString()] = map.getOrDefault(i.toString(),0)+1
    }

    for((key,value) in map){
        if (value>sum){
            sum = value
            result = key
        }else if(map[key]==sum){
            result="?"
        }

    }
    println(result)
}
