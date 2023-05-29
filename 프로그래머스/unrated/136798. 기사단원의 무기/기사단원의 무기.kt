class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        
        for (i in 1..number) {
            var sum = 0
            for (j in 1..Math.sqrt(i.toDouble()).toInt()) {
                if (i % j == 0) {
                    sum++
                    if (i / j != j) {
                        sum++
                    }
                }                
            }
            if (sum > limit) {
                sum = power
            }
            answer += sum
        }
        return answer
    }
}