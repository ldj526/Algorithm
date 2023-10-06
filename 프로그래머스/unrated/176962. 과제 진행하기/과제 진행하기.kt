import java.util.*

class Solution {
    fun solution(plans: Array<Array<String>>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        val plan = plans.sortedWith(Comparator { o1, o2 -> o1[1].compareTo(o2[1]) })
        val st = mutableListOf<Subject>()
        for (i in plan.indices) {
            val subJ = plan[i][0]
            val startTime = plan[i][1].split(":")[0].toInt() * 60 + plan[i][1].split(":")[1].toInt()
            val remainTime = plan[i][2].toInt()

            if (i != plan.size - 1) {
                val nextTime = plan[i + 1][1].split(":")[0].toInt() * 60 + plan[i + 1][1].split(":")[1].toInt()
                if (startTime + remainTime <= nextTime) {
                    answer += subJ
                    var emptyTime = nextTime - startTime - remainTime
                    while (emptyTime > 0 && st.isNotEmpty()) {
                        if (emptyTime - st.last().startTime >= 0) {
                            emptyTime -= st.last().startTime
                            answer += st.last().subject
                            st.removeLast()
                            continue
                        }
                        if (emptyTime - st.last().startTime < 0) {
                            st.last().startTime -= emptyTime
                            emptyTime = 0
                        }
                    }
                }
                if (startTime + remainTime > nextTime) {
                    st.add(Subject(subJ, (startTime + remainTime) - nextTime))
                }
            } else {
                answer += subJ
            }

        }
        while(st.isNotEmpty()){
            answer += st.last().subject
            st.removeLast()
        }
        return answer
    }

    data class Subject(
        val subject: String, var startTime: Int
    )
}