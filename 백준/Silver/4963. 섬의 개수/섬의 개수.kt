import java.io.BufferedReader
import java.io.InputStreamReader

lateinit var graph : Array<IntArray>
lateinit var visited : Array<BooleanArray>
val dx = arrayOf(1,-1,0,0,1,1,-1,-1)
val dy = arrayOf(0,0,1,-1,1,-1,1,-1)
var w = 0
var h =0
var count = 0
fun main() {
   val br = BufferedReader(InputStreamReader(System.`in`))

    while (true){
        var input= br.readLine().split(" ").map{it.toInt()}
        w = input[0]
        h = input[1]

        if (w==0 && h==0) break
        
        graph = Array(h){
            br.readLine().split(" ").map { it.toInt() }.toIntArray()
        }

        visited = Array(h){BooleanArray(w)}

        for (i in 0 until h){
            for (j in 0 until  w){
                if (!visited[i][j] && graph[i][j]==1){
                    count+=1
                    dfs(i,j)

                }
            }
        }
        println(count)
        count = 0


    }


}

fun dfs(x:Int, y:Int){

    visited[x][y] =true

    for (i in 0 until 8){
        val nx = x+dx[i]
        val ny = y+dy[i]

        if (nx in 0 until h && ny in 0 until w){
            if (!visited[nx][ny] && graph[nx][ny]==1){
                dfs(nx,ny)
            }
        }
    }
}