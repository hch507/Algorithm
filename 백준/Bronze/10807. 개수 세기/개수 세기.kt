import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var a = nextInt()
    var b : ArrayList<Int> = ArrayList()
    var cnt = 0
    for(i in 0 until a){
        b.add(nextInt())
    }
    var c = nextInt()

    for(i in b){
        if(c==i){
           cnt ++
        }
    }
    println(cnt)
}