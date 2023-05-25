class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        
        val todaySum = today.split(".")[0].toInt() * 12 * 28 +
                today.split(".")[1].toInt() * 28 +
                today.split(".")[2].toInt()
                
        for(i in privacies.indices) {
            var prSum = privacies[i].split(".")[0].toInt() * 12 * 28 +
                    privacies[i].split(".")[1].toInt() * 28 +
                    privacies[i].split(".")[2].split(" ")[0].toInt()
                    
            for(j in terms.indices) {
                if(privacies[i].contains(terms[j][0])) {
                    prSum += terms[j].split(" ")[1].toInt() * 28
                    break
                }
            }
            
            if(todaySum >= prSum) answer += i + 1
        }
        return answer
    }
}