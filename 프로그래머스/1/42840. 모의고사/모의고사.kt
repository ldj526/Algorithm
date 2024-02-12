class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        val userAnswers =
            arrayOf(intArrayOf(1, 2, 3, 4, 5), intArrayOf(2, 1, 2, 3, 2, 4, 2, 5), intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5))
        val cnt = IntArray(3)
        userAnswers.forEachIndexed { i, userAns ->
            cnt[i] = answers.filterIndexed { j, ans ->
                ans == userAns[j % userAns.size]
            }.count()
        }
        val maxCnt = cnt.maxOrNull() ?: 0
        cnt.forEachIndexed { index, i ->
            if (maxCnt == i)
                answer += index + 1
        }
        return answer
    }
}