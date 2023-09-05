class Solution {
    fun solution(targets: Array<IntArray>): Int {
        
    var cut = -1
    var answer = 0
    val list = targets.toMutableList()
    list.sortBy { it[1] }
    for (target in list) {
        if (target[0] >= cut) {
            cut = target[1]
            answer++
        }
    }
    return answer
    }
}