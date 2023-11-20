class Solution {
    fun solution(s: String): IntArray {
        var answer = intArrayOf()
        val str = s.substring(2, s.length - 2).split("},{").sortedBy { it.length }
        str.forEach { list ->
            list.split(",").forEach {
                if(!answer.contains(it.toInt())) answer += it.toInt()
            }
        }
        return answer
    }
}