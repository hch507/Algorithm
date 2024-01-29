import java.util.*

fun main()=with(Scanner(System.`in`)){
    val score = nextInt()
    
    when(score){
        in 90..100 -> println("A")
        in 80 until 90 -> println("B")
        in 70 until 80 -> println("C")
        in 60 until 70 -> print("D")
        else -> print("F")
    }
}