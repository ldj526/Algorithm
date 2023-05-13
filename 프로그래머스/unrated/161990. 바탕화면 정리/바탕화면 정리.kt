class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var answer: IntArray = intArrayOf(0, 0, 0, 0)
        val board = ArrayList<Pair<Int, Int>>()
        for (i in wallpaper.indices) {
            for (j in 0 until wallpaper[0].length) {
                if (wallpaper[i][j] == '#') {
                    board.add(Pair(i, j))
                }
            }
        }
        
        val sortXBoard = board.sortedWith(compareBy { it.first })
        val minX = sortXBoard[0].first
        val maxX = sortXBoard[board.size - 1].first
        val sortYBoard = board.sortedWith(compareBy { it.second })
        val minY = sortYBoard[0].second
        val maxY = sortYBoard[board.size - 1].second
        
        answer[0] = minX
        answer[1] = minY
        answer[2] = maxX + 1
        answer[3] = maxY + 1
        
        return answer
    }
}