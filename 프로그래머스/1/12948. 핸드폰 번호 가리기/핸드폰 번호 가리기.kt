class Solution {
    fun solution(phone_number: String): String {
        return phone_number.mapIndexed { index, c -> if (index > phone_number.length - 5) c else "*" }.joinToString("")
    }
}