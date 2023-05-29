class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val HOF = ArrayList<Int>(k)
        
        for (i in score.indices) {
            if (HOF.size == k) {
                HOF.sort()
                if (HOF.first() < score[i]) {
                    HOF.removeFirst()
                    HOF.add(score[i])
                    HOF.sort()
                    answer += HOF.first()
                } else {
                    answer += HOF.first()
                }
            } else {
                HOF.add(score[i])
                HOF.sort()
                answer += HOF.first()
            }
        }
        return answer
    }
}