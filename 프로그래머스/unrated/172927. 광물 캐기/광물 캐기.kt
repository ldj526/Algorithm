class Solution {
    fun solution(picks: IntArray, minerals: Array<String>): Int {
        var answer = 0
        val cnt = Math.min(minerals.size / 5 + 1, picks[0] + picks[1] + picks[2])
        val arr = Array(cnt) { IntArray(3) }
        for (i in minerals.indices step 5) {
            var dp = 0
            var ip = 0
            var sp = 0
            if (i / 5 == cnt) break
            for (j in i until i + 5) {
                val str = minerals[j]
                when (str) {
                    "diamond" -> {
                        dp += 1
                        ip += 5
                        sp += 25
                    }
                    "iron" -> {
                        dp += 1
                        ip += 1
                        sp += 5
                    }
                    else -> {
                        dp += 1
                        ip += 1
                        sp += 1
                    }
                }
                if (j == minerals.size - 1) break
            }
            arr[i / 5][0] = dp
            arr[i / 5][1] = ip
            arr[i / 5][2] = sp
        }
        arr.sortWith(Comparator { o1, o2 -> o2[2] - o1[2] })

        for (i in 0 until cnt) {
            if (picks[0] != 0) {
                answer += arr[i][0]
                picks[0]--
            } else if (picks[1] != 0) {
                answer += arr[i][1]
                picks[1]--
            } else {
                answer += arr[i][2]
                picks[2]--
            }
        }
        return answer
    }
}