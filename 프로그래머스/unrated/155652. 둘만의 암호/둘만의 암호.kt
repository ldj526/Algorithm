class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        val ch = ('a' .. 'z').filter { it !in skip }
        
        s.forEach {
            val idx = (ch.indexOf(it) + index) % ch.size
            answer += ch[idx]
        }
        
        return answer
    }
}