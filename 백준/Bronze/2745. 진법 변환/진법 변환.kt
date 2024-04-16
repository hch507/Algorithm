import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val N = next()
    val B = nextInt()
    var result = 0
    
    for (i in 0 until N.length) {
        if ('0' <= N[i] && '9' >= N[i]) {
            result = result * B + (N[i] - '0')
        } else {
            result = result * B + (N[i] - 'A' + 10)
        }
    }
    
    print(result)
}