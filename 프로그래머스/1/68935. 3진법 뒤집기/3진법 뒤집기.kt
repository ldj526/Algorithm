import java.util.*

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val st = Stack<Int>()
        var tmp = n
        var num = 0
        while (tmp != 0) {
            st.push(tmp % 3)
            tmp /= 3
        }
        while (st.isNotEmpty()) {
            answer += st.pop() * Math.pow(3.0, num.toDouble()).toInt()
            num++
        }
        return answer
    }
}