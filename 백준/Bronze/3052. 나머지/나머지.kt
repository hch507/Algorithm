import java.util.Scanner

fun main() = with(Scanner(System.`in`)){


    var array = ArrayList<Int>()
    repeat(10){
        val num = nextInt()
        val a = num%42
        array.add(a)
    }
    print(array.distinct().size)
}