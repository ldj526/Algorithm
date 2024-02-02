class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        answer = arr.filter { it % divisor == 0 }.sorted().toIntArray()
        if (answer.isEmpty()) answer = intArrayOf(-1)
        return answer
    }
}