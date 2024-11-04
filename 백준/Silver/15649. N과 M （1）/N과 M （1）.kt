import java.util.*

var n = 0
var m = 0
lateinit var chk: Array<Boolean>
lateinit var rs : Stack<Int>
fun main() = with(Scanner(System.`in`)) {
    n = nextInt()
    m = nextInt()
    chk =Array(n+1){false}
    rs = Stack()

    recur(0)
}

fun recur(num: Int) {
    if (num == m) {
        for (i in rs) {
            print("${i} ")
        }
        println()
        return
    }
    for (i in 1 until n+1)
        if (chk[i]==false){
            chk[i] =true
            rs.push(i)
            recur(num+1)
            chk[i]= false
            rs.pop()
        }

}
