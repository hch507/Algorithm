import java.util.*

fun main() = with(Scanner(System.`in`)){
   val num = nextInt()
   var array = ArrayList<Int>()
   for(i in 1..num){
       array.add(nextInt())
   }
   var num2 = nextInt()
   var cnt = 0 
   for( i in array){
       if(i==num2) cnt+=1
   }
   println(cnt)
}