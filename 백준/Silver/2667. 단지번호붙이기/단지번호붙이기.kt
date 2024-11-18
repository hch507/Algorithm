import java.util.*

lateinit var map: Array<IntArray>
lateinit var chk: Array<BooleanArray>
var n = 0
lateinit var a: ArrayList<Int>
var q: Queue<Dot> = LinkedList()

data class Dot(
    val y: Int,
    val x: Int
)

val dy = arrayOf(-1, 1, 0, 0) // 상, 하, 좌, 우
val dx = arrayOf(0, 0, -1, 1)

fun main() = with(Scanner(System.`in`)) {
    n = nextInt()
    nextLine() // 남아 있는 줄바꿈 문자를 처리
    a = ArrayList()
    map = Array(n) { IntArray(n) }
    chk = Array(n) { BooleanArray(n) { false } }

    // 지도 입력
    for (j in 0 until n) {
        val line = nextLine()
        for (i in line.indices) {
            map[j][i] = line[i] - '0' // Char -> Int 변환
        }
    }

    // 단지 탐색
    var cnt = 0
    for (j in 0 until n) {
        for (i in 0 until n) {
            if (!chk[j][i] && map[j][i] == 1) {
                cnt++
                bfs(j, i)
            }
        }
    }

    // 결과 출력
    a.sort() // 오름차순 정렬
    println(cnt)
    for (k in a) {
        println(k)
    }
}

fun bfs(y: Int, x: Int) {
    q.add(Dot(y, x))
    chk[y][x] = true
    var sum = 1

    while (q.isNotEmpty()) {
        val dot = q.remove()
        for (i in 0 until 4) {
            val ny = dot.y + dy[i]
            val nx = dot.x + dx[i]
            if (ny in 0 until n && nx in 0 until n) { // 유효 범위 검사
                if (!chk[ny][nx] && map[ny][nx] == 1) { // 방문하지 않았고, 집(1)이면
                    q.add(Dot(ny, nx))
                    chk[ny][nx] = true
                    sum++
                }
            }
        }
    }

    a.add(sum) // 단지 내 집의 개수 저장
}