import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (size, n) = br.readLine().split(" ").map{it.toInt()}
    val graph = Array(size+1){ mutableListOf<Int>() }
    val visited = BooleanArray(size+1)
    var cnt = 0
    repeat(n){
        val (a, b) = br.readLine().split(" ").map{it.toInt()}
        graph[a].add(b)
        graph[b].add(a)
    }
    for (i in 1.. size){
        if(!visited[i]){
            bfs(i,visited,graph)
            cnt++
        }
    }

    println(cnt)
}

fun bfs(start : Int, visited : BooleanArray, graph:Array<MutableList<Int>>){
    val queue = ArrayDeque<Int>()

    queue.add(start)
    visited[start]=true

    while (queue.isNotEmpty()){
        val now = queue.removeFirst()

        for(next in graph[now]){
            if (!visited[next]){
                visited[next]=true
                queue.add(next)
            }
        }
    }


}



