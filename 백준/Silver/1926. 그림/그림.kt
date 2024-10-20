import java.util.*



var n = 0
var m = 0
var cnt = 0
var rs = 0

var maxv = 0
var v : Queue<IntArray> = LinkedList()

var currentV = IntArray(2){i -> 0}
var dy = arrayOf(0, 1, 0, -1)
var dx = arrayOf(1, 0, -1, 0)
var ny = 0
var nx = 0
lateinit var map : Array<IntArray>
lateinit var chk : Array<BooleanArray>
fun main() = with(Scanner(System.`in`)){
    n= nextInt()
    m= nextInt()
    map = Array(n){IntArray(m)}
    chk = Array(n){BooleanArray(m){i -> false} }

    for (i in 0 until n ){
        for(j in 0 until m){
            map[i][j]=nextInt()
        }
    }
    for (i in 0 until n){
        for (j in 0 until m){
            if (map[i][j]==1 && chk[i][j] == false){
                cnt+=1
                chk[i][j] = true
                bfs(i,j)
                maxv= maxOf(maxv, rs)
            }
        }
    }
    println(cnt)
    println(maxv)
}


fun bfs(i : Int ,j: Int) {
    rs=1
    currentV[0] = i
    currentV[1] = j
    v.add(currentV)
    while (true){
        if (v.size!=0){

            currentV = v.poll()!!
            for (k in 0 until 4){
                ny = currentV[0]+dy[k]
                nx = currentV[1]+dx[k]


                if (ny >= 0 && ny < n && nx >= 0 && nx < m) {
                    if (map[ny][nx] == 1 && !chk[ny][nx]) {
                        rs += 1
                        chk[ny][nx] = true // 방문 체크
                        v.add(intArrayOf(ny, nx)) // 새 좌표 큐에 추가
                    }
                }
            }
        }else{
            return
        }
    }

}
