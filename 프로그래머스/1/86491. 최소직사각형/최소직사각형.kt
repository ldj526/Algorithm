class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxW = 0
        var maxH = 0
        for (s in sizes) {
            maxW = maxOf(maxW, s[0], s[1])
            maxH = maxOf(maxH, if (s[0] < s[1]) s[0] else s[1])
        }
        return maxW * maxH
    }
}