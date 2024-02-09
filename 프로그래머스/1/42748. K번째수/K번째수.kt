class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        commands.forEach {
            answer += array.toList().subList(it[0] - 1, it[1]).sorted()[it[2] - 1]
        }
        return answer
    }
}