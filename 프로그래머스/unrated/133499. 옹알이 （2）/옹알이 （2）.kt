class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        
        val pronounce = "aya|ye|woo|ma".toRegex()
        val pronounce2 = "ayaaya|yeye|woowoo|mama".toRegex()
        answer = babbling.map { it.replace(pronounce2, " ") }.map { it.replace(pronounce, "") }.filter { it == "" }.size
        return answer
    }
}