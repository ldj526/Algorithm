class Solution {
    fun solution(s: String): String {
        var answer = ""
        var idx = 0
        for (i in s.indices) {
            if (s[i] == ' ') {
                answer += " "
                idx = 0
            } else if (idx % 2 == 0) {
                answer += s[i].uppercaseChar()
                idx++
            } else {
                answer += s[i].lowercaseChar()
                idx++
            }
        }
        return answer
    }
}