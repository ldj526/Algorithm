class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        for (i in 1 until food.size) {
            repeat(food[i] / 2) {
                answer += i
            }
        }
        val rev = answer.reversed()
        answer += 0
        answer += rev
        return answer
    }
}