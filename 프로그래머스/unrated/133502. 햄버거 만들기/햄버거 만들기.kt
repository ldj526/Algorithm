class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        var cnt = 0
        val tmp = IntArray(ingredient.size)
        for (i in ingredient) {
            tmp[cnt++] = i
            if (cnt >= 4 && tmp[cnt - 4] == 1
                && tmp[cnt - 3] == 2
                && tmp[cnt - 2] == 3
                && tmp[cnt - 1] == 1) {
                cnt -= 4
                answer++
            }
        }
        return answer
    }
}