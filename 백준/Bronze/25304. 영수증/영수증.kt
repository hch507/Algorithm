import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val total = nextInt()
    var a = 0
    val num = nextInt()
    for (i in 1..num) {
        var money =nextInt()
        var num2 = nextInt()
        a= a+ money*num2
        
    }
    if(total == a ) println("Yes")
    else println("No")
}