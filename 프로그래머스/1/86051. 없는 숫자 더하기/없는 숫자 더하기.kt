class Solution {
    fun solution(numbers: IntArray): Int {
        return 45 - numbers.filter { it in 0..9 }.sum()
    }
}