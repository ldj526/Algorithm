class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var ch = ' '
        var cntX = 0
        var cntY = 0
        for (i in s.indices) {
            if (ch == ' ') {
                ch = s[i]
            }
            if (s[i] == ch) {
                cntX++
            } else {
                cntY++
            }
            if(cntX == cntY) {
                answer++
                cntX = 0
                cntY = 0
                ch = ' '
            }
        }
        if (ch != ' '){
            answer++
        }
        return answer
    }
}