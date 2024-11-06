import java.util.*

var n = 0
var m = 0
lateinit var rs : Stack<Int>
fun main() = with(Scanner(System.`in`)){
    n = nextInt()
    m = nextInt()
    rs = Stack()
    recur(0,1)
}
fun recur(num:Int, current :Int){
    if (num == m){
        for (i in rs){
            print("${i} ")
        }
        println()
        return
    }

    for (i in current..n){
        rs.push(i)
        recur(num+1, i)
        rs.pop()
    }
}
