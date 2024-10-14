import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    var input = nextLine().toString()
    var number = nextInt()


    print(input.get(number-1))

}