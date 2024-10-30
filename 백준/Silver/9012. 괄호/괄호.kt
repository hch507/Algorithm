import java.util.*
import kotlin.collections.ArrayList


fun main() = with(Scanner(System.`in`)){
    var a = nextInt()

    var v = ArrayList<String>()
    for(i in 0 until a){
        v.add(next())
    }
    var flag = true
    for( i in v){
        var stack =Stack<Char>()
        var flag = true
        for(j in i){
           if (j=='('){
               stack.push(')')
           }else{
               if (stack.isEmpty()){
                   flag=false
                   break
               }
               stack.pop()
           }
        }
        if (flag && stack.isEmpty()){
            println("YES")
        }else{
            println("NO")
        }
    }

}
