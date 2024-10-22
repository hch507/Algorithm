import java.util.*

data class Dot(
    val x: Int,
    val y: Int
)

fun main() = with(Scanner(System.`in`)) {
    var n = nextInt()
    var m = nextInt()
    var v: Queue<Int> = LinkedList()
    var map = Array(m) { Dot(0, 0) }
    var chk = Array(n) { false }
    var rs = 0
    v.add(1)
    chk[0] = true
    for (i in 0 until m) {
        var a = nextInt()
        var b = nextInt()
        map[i] = Dot(a, b)
    }

    while (!v.isEmpty()) {
        var dot = v.remove()

        for (i in 0 until m){
            if (map[i].x==dot && chk[map[i].y-1]==false){
                v.add(map[i].y)
                rs+=1
                chk[map[i].y-1]=true
            }else if (map[i].y==dot && chk[map[i].x-1]==false){
                v.add(map[i].x)
                rs+=1
                chk[map[i].x-1]=true
            }else{
                continue
            }
        }
    }
    print(rs)

}


