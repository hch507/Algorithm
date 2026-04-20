import java.io.BufferedReader
import java.io.InputStreamReader

lateinit var map: Array<IntArray>
lateinit var visitored: Array<BooleanArray>

var dx = arrayOf(-1,1,0,0)
var dy = arrayOf(0,0,-1,1)
var count = 0
var size = 0
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    size = br.readLine().toInt()
    map = Array(size) {
        br.readLine().map { it - '0' }.toIntArray()
    }
    val result = mutableListOf<Int>()
    visitored = Array(size) { BooleanArray(size) }
    for (i in 0..size-1){
        for (j in 0..size-1){
            if (!visitored[i][j] && map[i][j]==1){
                count=0
                dfs(i,j)
                result.add(count)
            }
        }
    }
    println(result.size)
    result.sorted().forEach{
        println(it)
    }


}
fun dfs(x:Int,y:Int){
    visitored[x][y]=true
    count++

    for (i in 0..3){
        val nx = x+ dx[i]
        val ny = y+ dy[i]

        if (nx in 0 until size && ny in 0 until size) {
            if (map[nx][ny] == 1 && !visitored[nx][ny]) {
                dfs(nx, ny)
            }
        }
    }

}


