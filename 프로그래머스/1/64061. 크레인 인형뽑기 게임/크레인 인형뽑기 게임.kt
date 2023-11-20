import java.util.*

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val basket = Stack<Int>()
        
        moves.forEach {
            for (i in board.indices) {
                if (board[i][it - 1] != 0) {
                    if (basket.isNotEmpty() && basket.peek() == board[i][it - 1]) {
                        answer += 2
                        basket.pop()
                    } else {
                        basket.push(board[i][it - 1])
                    }
                    board[i][it - 1] = 0
                    break
                }
            }
        }
        return answer
    }
}