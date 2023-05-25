class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = "Yes"
        var idx1 = 0
        var idx2 = 0
        for (i in goal.indices) {
            if (idx1 < cards1.size && goal[i] == cards1[idx1]) {
                idx1++
            } else if(idx2 < cards2.size && goal[i] == cards2[idx2]) {
                idx2++
            } else {
                return "No"
            }
        }
        return answer
    }
}