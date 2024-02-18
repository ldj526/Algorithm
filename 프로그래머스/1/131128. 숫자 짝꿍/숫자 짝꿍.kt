class Solution {
    fun solution(X: String, Y: String): String {
        var answer: String = ""
        for (ch in (9 downTo 0).toList().map { it.toString() }) {
            answer += ch.repeat(Math.min(X.count { it.toString() == ch }, Y.count { it.toString() == ch }))
        }
        return if (answer.isEmpty()) "-1" else if (answer[0] == '0') "0" else answer
    }
}