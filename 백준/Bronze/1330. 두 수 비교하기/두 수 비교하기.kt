import java.util.*

fun main() = with(Scanner(System.`in`)){
    val a = nextInt()
    val b = nextInt()
    
    if(a>b) println(">")
    else if (a<b) println("<")
    else print("==")
}