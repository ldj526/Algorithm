class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        val isUsed = BooleanArray(n + 1) { true }
        section.forEach { x->
            isUsed[x] = false
        }
        
        var idx = section[0]
        while(idx <= isUsed.size - 1) {
            if(!isUsed[idx]) {
                for(i in 0 until m) {
                    if (idx > isUsed.size - 1) break
                    isUsed[idx] = true
                    idx++
                }
                answer++
            } else {
                idx++
            }
        }
        return answer
    }
}