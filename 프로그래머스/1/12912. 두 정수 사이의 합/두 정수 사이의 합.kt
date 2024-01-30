class Solution {
    fun solution(a: Int, b: Int): Long {
        val st = minOf(a, b).toLong()
        val en = maxOf(a, b).toLong()
        return (st..en).sum()
    }
}