class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        answer = arr.filter { it != arr.minOrNull() }.toIntArray()
        return if (answer.isEmpty()) intArrayOf(-1) else answer
    }
}