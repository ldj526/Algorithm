class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        val map = HashMap<String, Int>()
        val sumList = ArrayList<Int>()
        for (i in name.indices) {
            map[name[i]] = yearning[i]
        }
        
        for (i in photo.indices) {
            var sum = 0
            for (j in 0 until photo[i].size) {
                if (map.contains(photo[i][j])) {
                    sum += map[photo[i][j]]!!
                }
            }
            sumList.add(sum)
         }
        answer = sumList.toIntArray()
        return answer
    }
}