import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val arr = ArrayList<Int>()

    for(i in 1..9){
        arr.add(nextInt())
    }

    println("${arr.max()}")
    println("${arr.indexOf(arr.max())+1}")
}

