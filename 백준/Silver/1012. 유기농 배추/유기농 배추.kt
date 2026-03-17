import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val tc = br.readLine().toInt()

    repeat(tc){
        val (m, n, l) = br.readLine().split(" ").map { it.toInt() }

        val map = Array(n){ IntArray(m)}
        var cnt = 0
        repeat(l){

            var (a,b) = br.readLine().split(" ").map{it.toInt()}
            map[b][a]  = 1
        }

        for(i in 0 until  n){
            for (j in 0 until m){
                if (map[i][j]==1){
                    cnt++
                    bfs(i,j,map,n,m)
                }
            }
        }
        println(cnt)

    }




}

fun bfs(x:Int, y:Int, map : Array<IntArray>,n : Int, m : Int){

    val dx = intArrayOf(1,-1,0,0)
    val dy = intArrayOf(0,0,1,-1)


    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.add(x to y)
    map[x][y]=0

    while(queue.isNotEmpty()){
        val(ex, ey) = queue.removeFirst()

        for(i in 0 until 4){
            val nx = ex+dx[i]
            val ny = ey+dy[i]

            if (nx in 0 until n && ny in 0 until m){
                if (map[nx][ny]==1){
                    map[nx][ny]=0
                    queue.add(nx to ny)
                }
            }
        }
    }

}


