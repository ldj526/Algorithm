class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var tmp = n
        while (tmp > 0) {
            answer += tmp % 10
            tmp /= 10
        }
        return answer
    }
}