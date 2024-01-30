import java.util.*

fun main() = with(Scanner(System.`in`)){
   val size = nextInt()
   val num = nextInt()
   for(i in 1..size){
       var num2 = nextInt()
        if (num2 < num) {
            print("$num2 ")
        }
   }
}