import java.io.BufferedReader
import java.io.InputStreamReader

lateinit var graph : Array<MutableList<Int>>
lateinit var visitored : BooleanArray
var count = 0
fun main(){
    var br = BufferedReader(InputStreamReader(System.`in`))

    val(n, v) = br.readLine().split(" ").map { it.toInt() }
    visitored = BooleanArray(n+1)
    graph = Array(n+1){ mutableListOf() }
    repeat(v){
        var(a, b) = br.readLine().split(" ").map { it.toInt() }

        graph[a].add(b)
        graph[b].add(a)
    }

    for (i in 1..n){

        if (!visitored[i]){
            count++
            dfs(i)
        }
    }

    print(count)
}

fun dfs(start : Int){
    visitored[start] = true

    for (i in graph[start]){
        if (!visitored[i]){
            dfs(i)
        }
    }

}
