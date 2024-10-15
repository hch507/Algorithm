import java.util.Scanner



fun main() = with(Scanner(System.`in`)){
    var n = nextInt()
    var m = nextInt()
    var a = Array(n){IntArray(m)}
    for(i in 0 until  n){
        for (j in 0 until m)
        a[i][j] = nextInt()
    }

    for(i in 0 until  n){
        for (j in 0 until m)
            a[i][j] += nextInt()
    }

    for(i in 0 until  n){
        for (j in 0 until m)
            print("${a[i][j]} ")
    }
    println()
}