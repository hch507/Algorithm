import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val a = br.readLine().toInt()
    val b = br.readLine().toInt()
    val c = br.readLine().toInt()

    val sum = (a*b*c).toString()

    val map = mutableMapOf<String, Int>()

    for( i in sum){
        map[i.toString()] = map.getOrDefault(i.toString(),0)+1
    }

    for(i in 0 until 10){
        if (map[i.toString()]==null){
            println("0")
        }else{
            println(map[i.toString()])
        }

    }

}


