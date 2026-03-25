import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val stack = ArrayDeque<String>()
    repeat(n){
        val input= br.readLine().split(" ")
        val a = input[0]
        val b = input.getOrNull(1)?.toInt() ?: 0
        when (a) {
            "push" -> stack.addLast(b.toString())
            "top" -> println(stack.lastOrNull() ?: -1)
            "pop" -> println(stack.removeLastOrNull() ?: -1)
            "size" -> println(stack.size)
            "empty" -> println(if (stack.isEmpty()) 1 else 0)
        }
    }
}

