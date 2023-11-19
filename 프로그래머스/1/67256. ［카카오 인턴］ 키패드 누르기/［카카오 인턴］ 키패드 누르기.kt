class Solution {
    
    var left = intArrayOf(1, 4, 7, 10)
    var right = intArrayOf(3, 6, 9, 12)
    var locate = intArrayOf(10, 12)
    
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        val left = intArrayOf(1, 4, 7, 10)
        val right = intArrayOf(3, 6, 9, 12)
        
        numbers.forEach {
            answer += when(it) {
                in left -> {
                    leftHand(it)
                }
                in right -> {
                    rightHand(it)
                }
                else -> {
                    middle(it, hand)
                }
            }
        }
        return answer
    }
    
    fun leftHand(number: Int): String {
        locate[0] = number
        return "L"
    }
    
    fun rightHand(number: Int): String {
        locate[1] = number
        return "R"
    }
    
    fun middle(number: Int, hand: String): String {
        val n = if(number == 0) 11 else number
        
        val leftDis = Math.abs((locate[0] - n) / 3 + (locate[0] - n) % 3)
        val rightDis = Math.abs((locate[1] - n) / 3 + (locate[1] - n) % 3)
        
        return if (leftDis < rightDis) leftHand(n)
        else if (leftDis > rightDis) rightHand(n)
        else {
            if (hand == "left") leftHand(n) else rightHand(n)
        }
    }
}