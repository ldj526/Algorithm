import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.max
import java.util.*

lateinit var vis: Array<BooleanArray>
lateinit var board: Array<IntArray>
val dx = intArrayOf(1, 0, -1, 0)
val dy = intArrayOf(0, 1, 0, -1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    board = Array(n) { IntArray(m) }
    vis = Array(n) { BooleanArray(m) }
    repeat(n) { col ->
        val list = readLine().split(" ").map { it.toInt() }
        list.forEachIndexed { row, num ->
            board[col][row] = num
        }
    }
    var mxArea = 0
    var paintCnt = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (board[i][j] == 0 || vis[i][j]) continue
            paintCnt++
            val queue: Queue<Pair<Int, Int>> = LinkedList()
            vis[i][j] = true
            queue.add(Pair(i, j))
            var area = 0
            while (queue.isNotEmpty()) {
                area++
                val cur: Pair<Int, Int> = queue.first()
                queue.poll()
                for (dir in 0 until 4) {
                    val nx = cur.first + dx[dir]
                    val ny = cur.second + dy[dir]
                    if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
                    if (vis[nx][ny] || board[nx][ny] != 1) continue
                    vis[nx][ny] = true
                    queue.add(Pair(nx, ny))
                }
            }
            mxArea = max(mxArea, area)
        }
    }
    println("$paintCnt\n$mxArea")
}