class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var next = 0
        section.forEach {
            if (it >= next) {
                answer++
                next = it + m
            }
        }
        return answer
    }
}