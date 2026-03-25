import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var input = br.readLine().toInt()
    var cnt = 0
    if (input<10){
        input *= 10
    }
    var newNum  = input

    while (true){
        cnt++
        val a = newNum / 10
        val b = newNum % 10
        val c = (a + b) % 10

        newNum = b * 10 + c
        if (newNum==input){
            break
        }
    }
    print(cnt)

}


