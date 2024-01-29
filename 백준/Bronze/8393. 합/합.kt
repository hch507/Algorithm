import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()
    var sum = 0
    for (i in 1..num) {
        sum = sum+i
    }
    println(sum)
}