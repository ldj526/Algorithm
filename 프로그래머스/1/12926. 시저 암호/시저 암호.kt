class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        answer += s.toCharArray().map {
            when (it.code) {
                in 65..90 -> {
                    ((it + n - 65).code % 26 + 65).toChar()
                }
                in 97..122 -> {
                    ((it + n - 97).code % 26 + 97).toChar()
                }
                else -> " "
            }
        }.joinToString("")
        return answer
    }
}