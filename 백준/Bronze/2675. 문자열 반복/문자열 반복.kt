import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var cnt = nextInt()

    for (i in 1..cnt){
        var a = nextInt()
        var alpha = next().toString()
        for (e in 1 .. alpha.length){
            for (b in 1 .. a){
                print(alpha.get(e-1))
            }
        }
        println()
    }
}