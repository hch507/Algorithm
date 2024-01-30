import java.util.Scanner

fun main(){
    var sc = Scanner(System.`in`)

    val arr = ArrayList<Int>()

    for (i in 1 .. 9){
        arr.add(sc.nextInt())
    }

    print("${arr.maxOrNull()} ${arr.indexOf(arr.maxOrNull())+1}")
}