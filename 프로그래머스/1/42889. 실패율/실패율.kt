class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        val stageCnt = IntArray(N + 1)
        stages.forEach {
            if (it <= N) stageCnt[it]++
        }
        val stageList = ArrayList<StageInfo>()
        var remain = stages.size
        for (stage in 1..N) {
            val failureRate = if (remain > 0) stageCnt[stage].toDouble() / remain else 0.0
            stageList.add(StageInfo(stage, failureRate))
            remain -= stageCnt[stage]
        }
        val sortedList = stageList.sortedWith(compareByDescending<StageInfo> { it.failure }.thenBy { it.stage })
        return sortedList.map { it.stage }.toIntArray()
    }
    
    data class StageInfo(val stage: Int, val failure: Double)
}