import java.util.Scanner

fun main() = with(Scanner(System.`in`)){

    var m = nextInt()
    var n = nextInt()
    val arr = IntArray(m){0}
    for( i in 1..n ){
        val i = nextInt()
        val j = nextInt()
        val k = nextInt()

        for(a in i until j+1){
            arr[a-1]=k
        }
    }
    arr.forEach { print("${it} ") }
}

