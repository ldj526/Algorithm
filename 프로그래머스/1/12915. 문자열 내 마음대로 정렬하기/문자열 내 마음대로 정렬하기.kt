class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()
        answer += strings.sortedWith(compareBy({ it[n] }, { it }))
        return answer
    }
}