import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
   val br = BufferedReader(InputStreamReader(System.`in`))

    val input = br.readLine().toInt()
    var gap = 0

    repeat(input){
        println(input-gap)
        gap++
    }
}