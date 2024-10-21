import java.util.*
var n = 0
var m = 0
lateinit var map : Array<IntArray>
lateinit var chk : Array<BooleanArray>
var ex =0
var ey =0
var v : Queue<Array<Int>> = LinkedList()
var v1 = Array(2){i->0}
val dx = arrayOf(1,0,-1,0)
val dy = arrayOf(0,1,0,-1)

fun main() = with(Scanner(System.`in`)){
    val input = readLine()?.split(" ")
    n = input?.get(0)!!.toInt()
    m = input?.get(1)!!.toInt()
    map = Array(n){IntArray(m)}
    chk= Array(n){BooleanArray(m){false} }
    for(i in 0 until n){
        val line = nextLine()
        for (j in 0 until m){
            map[i][j]= line[j].toString().toInt()

        }
    }

    chk[0][0]=true
    bfs(0,0)
    println(map[n-1][m-1])
}

fun bfs(x:Int, y:Int) {
    v.add(arrayOf(x,y))
    while (true){
        if (v.size!=0){
            v1=v.remove()
            ex = v1[0]
            ey = v1[1]
            for(k in 0 until 4){
                val nx = ex+dx[k]
                val ny = ey+dy[k]
                if (nx<0 || nx>=m ||ny<0||ny>=n) continue
                if (map[ny][nx] ==0 || chk[ny][nx]==true) continue

                v.add(arrayOf(nx, ny))
                map[ny][nx] = map[ey][ex]+1
                chk[ny][nx]= true
            }
        }else{
            return
        }
    }




}
