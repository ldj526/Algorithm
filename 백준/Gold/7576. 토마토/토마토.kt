import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

lateinit var dist: Array<IntArray>
lateinit var board: Array<IntArray>
val dx = intArrayOf(1, 0, -1, 0)
val dy = intArrayOf(0, 1, 0, -1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (m, n) = readln().split(" ").map { it.toInt() }
    dist = Array(n) { IntArray(m) }
    board = Array(n) { IntArray(m) }
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    repeat(n) { col ->
        val list = readln().split(" ").map { it.toInt() }
        list.forEachIndexed { row, num ->
            board[col][row] = num
            if (board[col][row] == 1) {
                queue.add(Pair(col, row))
            }
            if (board[col][row] == 0) {
                dist[col][row] = -1
            }
        }
    }
    while (queue.isNotEmpty()) {
        val cur: Pair<Int, Int> = queue.first()
        queue.poll()
        for (dir in 0 until 4) {
            val nx = cur.first + dx[dir]
            val ny = cur.second + dy[dir]
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
            if (dist[nx][ny] >= 0) continue
            dist[nx][ny] = dist[cur.first][cur.second] + 1
            queue.add(Pair(nx, ny))
        }
    }
    var days = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (dist[i][j] == -1) {
                println("-1")
                return
            }
            days = max(days, dist[i][j])
        }
    }
    println(days)
}