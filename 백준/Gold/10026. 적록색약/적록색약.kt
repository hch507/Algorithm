import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val map = Array(n) { CharArray(n) }
    val blindMap = Array(n) { CharArray(n) }
    val visited = Array(n){BooleanArray(n)}
    val visited2 = Array(n){BooleanArray(n)}
    var cnt = 0
    var cnt2 = 0
    repeat(n) {i ->
        val line = br.readLine()
        for (j in 0 until n){
            map[i][j] = line[j]
            blindMap[i][j] = if (line[j] == 'G') 'R' else line[j]
        }

    }

    for(i in 0 until n){
        for (j in 0 until n){
            if (!visited[i][j]){
                bfs(i,j,visited,map,n)
                cnt++
            }
        }
    }
    for(i in 0 until n){
        for (j in 0 until n){
            if (!visited2[i][j]){
                bfs(i,j,visited2,blindMap,n)
                cnt2++
            }
        }
    }

    println("$cnt $cnt2")
}

fun bfs(i: Int,j :Int, visited: Array<BooleanArray>, map: Array<CharArray>,size:Int) {


    val queue = ArrayDeque<Pair<Int, Int>>()
    val ex = intArrayOf(1,-1,0,0)
    val ey = intArrayOf(0,0,1,-1)

    queue.add(i to j)
    visited[i][j]=true
    val data= map[i][j]

    while (queue.isNotEmpty()){
        val (a,b) = queue.removeFirst()
        for (i in 0 until 4){
            val nx = a+ex[i]
            val ny = b+ey[i]

            if(nx in 0 until size && ny in 0 until size){
                if (!visited[nx][ny]&& map[nx][ny]==data){
                    visited[nx][ny]=true
                    queue.add(nx to ny)
                }
            }
        }
    }
}