import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

lateinit var vis: Array<BooleanArray>
lateinit var board: Array<IntArray>
val dx = arrayOf(1, -1, 0, 0)
val dy = arrayOf(0, 0, 1, -1)
var n = 0
var mxHeight = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    n = readln().toInt()
    vis = Array(n) { BooleanArray(n) }
    board = Array(n) { IntArray(n) }
    repeat(n) { i ->
        val list = readln().split(" ").map { it.toInt() }
        list.forEachIndexed { j, num ->
            board[i][j] = num
            mxHeight = max(board[i][j], mxHeight)
        }
    }
    var mxCnt = 0
    for (limit in 0..mxHeight) {
        vis = Array(n) { BooleanArray(n) }
        var cnt = 0
        repeat(n) { i ->
            repeat(n) { j ->
                if (board[i][j] > limit && !vis[i][j]) {
                    bfs(i, j, limit)
                    cnt++
                }
            }
        }
        mxCnt = max(mxCnt, cnt)
    }
    println(mxCnt)
}

fun bfs(a: Int, b: Int, limit: Int) {
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(Pair(a, b))
    vis[a][b] = true
    while (queue.isNotEmpty()) {
        val cur = queue.first()
        queue.poll()
        for (dir in 0 until 4) {
            val nx = cur.first + dx[dir]
            val ny = cur.second + dy[dir]
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue
            if (!vis[nx][ny] && board[nx][ny] > limit) {
                vis[nx][ny] = true
                queue.add(Pair(nx, ny))
            }
        }
    }
}