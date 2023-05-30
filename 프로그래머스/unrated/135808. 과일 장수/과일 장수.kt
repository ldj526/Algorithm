class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        
        score.sortDescending()
        val cnt = score.size / m
        for (i in 0 until cnt) {
            var min = k + 1
            for (j in 0 until m) {
                if (min > score[i * m + j]) {
                    min = score[i * m + j]
                }
            }
            answer += min * m
        }
        return answer
    }
}