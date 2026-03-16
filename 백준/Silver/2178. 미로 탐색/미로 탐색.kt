import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n,m) = br.readLine().split(" ").map{it.toInt()}
    val map = Array(n){br.readLine().map{it-'0'}.toIntArray()}

    val result = bfs(0,0,map)
    print(result)
}

fun bfs(x:Int,y:Int, map : Array<IntArray>):Int{
    val dx = intArrayOf(1,-1,0,0)
    val dy = intArrayOf(0,0,1,-1)
    val n = map.size
    val m = map[0].size
    var queue =ArrayDeque<Pair<Int, Int>>()
    queue.add(Pair(x,y))

    while (queue.isNotEmpty()) {
        val (ex, ey) = queue.removeFirst()

        for (i in 0 until 4) {
            val nx = ex + dx[i]
            val ny = ey + dy[i]

            if (nx in 0 until n && ny in 0 until m) {
                if (map[nx][ny] == 1) {
                    queue.add(Pair(nx, ny))
                    map[nx][ny] = map[ex][ey]+1
                }
            }
        }
    }
    return map[n-1][m-1]
}


