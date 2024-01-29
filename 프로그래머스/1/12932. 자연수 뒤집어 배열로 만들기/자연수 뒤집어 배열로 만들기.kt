class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        return n.toString().reversed().map { it -> it.toString().toInt() }.toIntArray()
    }
}