import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for (i in 1..sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                answer += i
                if (n / i != i) {
                    answer += (n / i)
                }
            }
        }
        return answer
    }
}