class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        val character = charArrayOf('R', 'T', 'C', 'F', 'J', 'M', 'A', 'N')
        val score = IntArray(8) { 0 }
        for (i in survey.indices) {
            score[character.indexOf(survey[i][0])] += choices[i] - 4
        }

        for (i in 0..7 step 2) {
            if (score[i] <= score[i + 1]) answer += character[i]
            else answer += character[i + 1]
        }
        return answer
    }
}