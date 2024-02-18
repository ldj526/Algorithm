class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val lostList = lost.sorted().filter { it !in reserve}.toMutableList()
        val reserveList = reserve.sorted().filter { it !in lost}.toMutableList()
        reserveList.forEach {
            when {
                it - 1 in lostList -> lostList.remove(it - 1)
                it + 1 in lostList -> lostList.remove(it + 1)
            }
        }
        return n - lostList.size
    }
}