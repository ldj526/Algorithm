class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var emptyCola = n
        
        while (emptyCola / a != 0) {
            val cola = (emptyCola / a) * b
            answer += cola
            emptyCola = cola + emptyCola % a
        }
        return answer
    }
}