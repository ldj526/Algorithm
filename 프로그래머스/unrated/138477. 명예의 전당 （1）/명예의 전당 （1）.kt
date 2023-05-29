import java.util.*

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val pq = PriorityQueue<Int>()
        
        for (i in score.indices) {
            pq.add(score[i])
            if(pq.size > k) {
                pq.poll()
            }
            answer += pq.peek()
        }
        return answer
    }
}