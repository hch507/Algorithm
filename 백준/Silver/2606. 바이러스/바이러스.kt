import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val size = br.readLine().toInt()
    val node = br.readLine().toInt()

    var graph=Array(size+1){ mutableListOf<Int>() }

    repeat(node){
        val (a, b ) = br.readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }
    val result= bfs(1, graph, size)
    print(result)

}

fun bfs(start : Int, graph : Array<MutableList<Int>>,size : Int):Int{
    val visit = BooleanArray(size+1)
    val queue = ArrayDeque<Int>()

    var count = 0
    queue.add(start)
    visit[start]= true

    while (queue.isNotEmpty()){
        val now =queue.removeFirst()

        for (next in graph[now]){
            if (!visit[next]){
                queue.add(next)
                visit[next]=true
                count++
            }
        }
    }
    return count
}
