import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val arr = ArrayList<Int>()
    var a = nextInt()

    for(i in 1..a){
        arr.add(nextInt())
    }

    print("${arr.min()} ${arr.max()}")
}

