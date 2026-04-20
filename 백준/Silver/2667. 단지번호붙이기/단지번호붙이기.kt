import java.util.*
import kotlin.collections.ArrayList

lateinit var map : Array<IntArray>
lateinit var chk : Array<BooleanArray>
var n = 0
var cnt = 0
lateinit var a : ArrayList<Int>
var q :Queue<Dot> = LinkedList()

data class Dot(
    val y: Int,
    val x: Int
)
val dy = arrayOf(0,1,0,-1)
val dx = arrayOf(1,0,-1,0)
var ex = 0
var ey = 0
fun main() = with(Scanner(System.`in`)){
    n = nextInt()
    a= ArrayList()
    nextLine()
    map = Array(n){IntArray(n)}
    chk = Array(n){BooleanArray(n){false} }
    for (j in 0 until n){
        val line = nextLine()
        for (i in 0 until n){
            map[j][i]=line[i].toString().toInt()
        }
    }

    for (j in 0 until n){
        for(i in 0 until n){
            if (chk[j][i]==false && map[j][i]==1){
                chk[j][i]=true
                cnt+=1
                bfs(j,i)
            }
        }
    }
    a.sort()
    println(cnt)
    for (k in a){
        println(k)
    }

}
fun bfs(y:Int,x:Int){
    q.add(Dot(y,x))
    var sum = 1
    while (!q.isEmpty()){
        val dot =q.remove()
        ey = dot.y
        ex = dot.x
        for (i in 0 until 4){
            val ny = ey + dy[i]
            val nx = ex + dx[i]
            if (ny>=0 && ny<n && nx>=0 && nx < n){
                if(chk[ny][nx]==false && map[ny][nx]==1){
                    q.add(Dot(ny,nx))
                    chk[ny][nx]=true
                    sum+=1
                }
            }
        }
    }
    a.add(sum)
}
