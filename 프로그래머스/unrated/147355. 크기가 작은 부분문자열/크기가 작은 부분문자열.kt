class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        
        for(i in 0 until t.length - p.length + 1) {
            var tNum = ""
            for(j in p.indices) {
                tNum += t[i + j]
            }
            if(tNum.toDouble() <= p.toDouble()) {
                answer++
            }
        }
        
        return answer
    }
}