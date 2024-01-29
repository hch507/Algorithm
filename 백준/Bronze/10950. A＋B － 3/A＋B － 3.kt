import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()
    
    for (i in 1..num) {
        var A = nextInt()
        var B = nextInt()
        
        println("${A + B}")
    }
}