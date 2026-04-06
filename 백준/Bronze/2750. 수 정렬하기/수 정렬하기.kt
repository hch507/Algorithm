
import java.io.BufferedReader
import java.io.InputStreamReader
fun main() {
    val br = System.`in`.bufferedReader()

    val size = br.readLine().toInt()
    val list = mutableListOf<Int>()

    for (i in 0 until size) {
        val item = br.readLine().toInt()
        list.add(item)
    }

    list.sort()  // list 자체를 오름차순 정렬

    for (i in 0 until size) {
        println(list[i])
    }
}