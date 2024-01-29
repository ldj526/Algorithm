class Solution {
    fun solution(num: Int): String {
        var answer = ""
        if (num % 2 == 0) answer = "Even"
        else if (num == 0) answer = "Even"
        else answer = "Odd"
        return answer
    }
}