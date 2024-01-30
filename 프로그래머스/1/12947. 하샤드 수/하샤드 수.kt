class Solution {
    fun solution(x: Int): Boolean {
        var tmp = x
        var sum = 0
        while (tmp > 0) {
            sum += tmp % 10
            tmp /= 10
        }
        return x % sum == 0
    }
}