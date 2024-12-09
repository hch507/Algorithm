import java.util.*
fun main() = with(Scanner(System.`in`)) {
    val n = nextInt() // an 배열의 크기
    val an = mutableListOf<Int>() // an 초기화
    for (i in 0 until n) {
        an.add(nextInt())
    }

    val m = nextInt() // bm 배열의 크기
    val bm = mutableListOf<Int>() // bm 초기화
    for (i in 0 until m) {
        bm.add(nextInt())
    }

    // an 정렬
    an.sort()

    // bm의 각 요소를 an에서 탐색
    for (i in bm) {
        search(an, 0, n - 1, i)
    }
}

fun search(an: List<Int>, st: Int, en: Int, target: Int) {
    if (st > en) {
        // 탐색 실패
        println("0")
        return
    }

    val mid = (st + en) / 2

    if (an[mid] == target) {
        // 탐색 성공
        println("1")
    } else if (an[mid] < target) {
        // 오른쪽 구간 탐색
        search(an, mid + 1, en, target)
    } else {
        // 왼쪽 구간 탐색
        search(an, st, mid - 1, target)
    }
}


