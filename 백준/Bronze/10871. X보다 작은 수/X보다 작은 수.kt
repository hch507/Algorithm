import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val arr = ArrayList<Int>()

    val num= nextInt()
    val num2 = nextInt()
    for( i in 1.. num){
        arr.add(nextInt())
    }

    for ( i in arr){
        if(i<num2){
            print("${i} ")
        }
    }
}

