class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        
        score.sortDescending()
        val cnt = score.size / m
        for (i in 1 .. cnt) {
            answer += score[i * m - 1] * m
        }
        return answer
    }
}