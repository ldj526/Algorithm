class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer = IntArray(targets.size) { 0 }
        for (i in 0 until targets.size) {
            var cnt = 0
            for (j in targets[i].indices) {
                var flag = false
                var idx = 101
                for (k in keymap.indices) {
                    if (keymap[k].contains(targets[i][j])) {
                        idx = kotlin.math.min(idx, keymap[k].indexOf(targets[i][j]) + 1)
                        flag = true
                    }
                }
                if (flag) {
                    cnt += idx
                } else {
                    cnt = 2602
                }   
            }
            if (cnt >= 2602) {
                answer[i] = -1
            } else {
                answer[i] = cnt
            }
        }
        return answer
    }
}