class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var tmp = s
        tmp = tmp.replace("zero", "0")
        tmp = tmp.replace("one", "1")
        tmp = tmp.replace("two", "2")
        tmp = tmp.replace("three", "3")
        tmp = tmp.replace("four", "4")
        tmp = tmp.replace("five", "5")
        tmp = tmp.replace("six", "6")
        tmp = tmp.replace("seven", "7")
        tmp = tmp.replace("eight", "8")
        tmp = tmp.replace("nine", "9")
        answer = tmp.toInt()
        return answer
    }
}