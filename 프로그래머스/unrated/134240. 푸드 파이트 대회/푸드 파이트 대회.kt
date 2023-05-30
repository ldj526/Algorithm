class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        for (i in 1 until food.size) {
            val cnt = food[i] / 2
            repeat(cnt) {
                answer += i
            }
        }
        answer += 0
        for (i in food.size - 1 downTo 1) {
            val cnt = food[i] / 2
            repeat(cnt) {
                answer += i
            }
        }
        if (answer.length < 3) {
            answer = ""
        }
        return answer
    }
}