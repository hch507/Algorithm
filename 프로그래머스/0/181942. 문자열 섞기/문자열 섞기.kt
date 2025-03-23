class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        var result = mutableListOf<Char>()
        
        for(i in 0 until str1.length){
            result.add(str1[i])
            result.add(str2[i])
        }
        answer = result.joinToString("")
        return answer
    }
}