
import java.io.BufferedReader
import java.io.InputStreamReader


lateinit var graph: Array<MutableList<Int>>
lateinit var visitored : BooleanArray
var count = 0
fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))

    val size = br.readLine().toInt()
    val n = br.readLine().toInt()
    graph = Array(size+1){ mutableListOf() }

    visitored = BooleanArray(size+1)
    repeat(n){
        var (a, b) = br.readLine().split(" ").map { it.toInt() }

        graph[a].add(b)
        graph[b].add(a)
    }

    dfs(1)

    print(count)

}

fun dfs(start : Int){
    visitored[start] = true

    for(i in graph[start]){
        if (!visitored[i]){
            count++
            dfs(i)
        }
    }
}
