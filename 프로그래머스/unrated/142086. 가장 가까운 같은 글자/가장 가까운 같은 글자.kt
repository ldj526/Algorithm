class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        val chk = IntArray(26) { -1 }
        for (i in s.indices) {
            val exist = if(chk[s[i] - 'a'] == -1) -1 else i - chk[s[i] - 'a']
            chk[s[i] - 'a'] = i
            answer += exist
        }
        return answer
    }
}