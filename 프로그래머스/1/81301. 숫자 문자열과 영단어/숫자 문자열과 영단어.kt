class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var tmp = s
        if(s.contains("zero")) tmp = tmp.replace("zero", "0")
        if(s.contains("one")) tmp = tmp.replace("one", "1")
        if(s.contains("two")) tmp = tmp.replace("two", "2")
        if(s.contains("three")) tmp = tmp.replace("three", "3")
        if(s.contains("four")) tmp = tmp.replace("four", "4")
        if(s.contains("five")) tmp = tmp.replace("five", "5")
        if(s.contains("six")) tmp = tmp.replace("six", "6")
        if(s.contains("seven")) tmp = tmp.replace("seven", "7")
        if(s.contains("eight")) tmp = tmp.replace("eight", "8")
        if(s.contains("nine")) tmp = tmp.replace("nine", "9")
        answer = tmp.toInt()
        return answer
    }
}