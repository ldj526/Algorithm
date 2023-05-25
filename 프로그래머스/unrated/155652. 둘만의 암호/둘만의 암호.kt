class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        
        s.forEach {
            var ch = it
            repeat(index) {
                if(ch == 'z') {
                    ch -= 25
                } else {
                    ch++
                }
                if(skip.contains(ch)) {
                    while(skip.contains(ch)) {
                        if(ch == 'z') {
                            ch -= 25
                        } else {
                            ch++
                        }
                    }
                }
            }
            answer += ch
        }
        
        return answer
    }
}