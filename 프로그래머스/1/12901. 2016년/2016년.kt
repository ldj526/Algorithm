class Solution {
    fun solution(a: Int, b: Int): String {
        val month = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val dayOfWeek = arrayOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
        val sum = month.take(a - 1).sum() + b
        return dayOfWeek[sum % 7]
    }
}