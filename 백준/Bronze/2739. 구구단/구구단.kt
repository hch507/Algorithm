import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()

    for(i in 1..9){
        println("${a} * ${i} = ${i*a}")
    }
}