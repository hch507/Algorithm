import java.util.*

fun main() = with(Scanner(System.`in`)){
   val num = nextInt()
   for(i in 1..num){
       var a1 = nextInt()
       var a2 = nextInt()

       println("Case #${i}: ${a1} + ${a2} = ${a1+a2}")
   }
}