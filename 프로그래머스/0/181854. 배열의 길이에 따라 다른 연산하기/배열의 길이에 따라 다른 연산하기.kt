class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        val answer = arr.copyOf() // 원본 배열을 복사하여 결과 배열 생성
        if (arr.size % 2 == 0) {
            // 배열 길이가 짝수라면 홀수 인덱스에 n을 더함
            for (i in arr.indices) {
                if (i % 2 != 0) { // 홀수 인덱스 확인
                    answer[i] += n
                }
            }
        } else {
            // 배열 길이가 홀수라면 짝수 인덱스에 n을 더함
            for (i in arr.indices) {
                if (i % 2 == 0) { // 짝수 인덱스 확인
                    answer[i] += n
                }
            }
        }
        return answer
    }
}