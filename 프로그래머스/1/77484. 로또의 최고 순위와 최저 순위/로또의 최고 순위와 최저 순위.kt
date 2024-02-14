class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val zeroCnt = lottos.count { it == 0 }
        val correctCnt = lottos.count { it in win_nums }
        answer += when (correctCnt + zeroCnt) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
        answer += when (correctCnt) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
        return answer
    }
}