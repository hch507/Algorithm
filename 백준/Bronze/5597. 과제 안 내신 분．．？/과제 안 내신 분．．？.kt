import java.util.Scanner

fun main() = with(Scanner(System.`in`)){


    var array = ArrayList<Int>()
    repeat(30){
        array.add(it+1)
    }
    for (i in 0 until 28){
        val num = nextInt()
        if (array.contains(num)){
            array.remove(num)
        }
    }
    array.forEach { print("$it ") }


}