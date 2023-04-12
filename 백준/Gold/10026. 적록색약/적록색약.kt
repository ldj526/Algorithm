import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

lateinit var vis: Array<BooleanArray>
lateinit var board: Array<CharArray>
var n: Int = 0
val dx = arrayOf(1, 0, -1, 0)
val dy = arrayOf(0, 1, 0, -1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    n = readln().toInt()
    board = Array(n) { CharArray(n) }
    vis = Array(n) { BooleanArray(n) }
    repeat(n) { i ->
        val str = readln()
        repeat(n) { j ->
            board[i][j] = str[j]
        }
    }
    val notDys = getCnt()

    vis = Array(n) { BooleanArray(n) { false } }
    repeat(n) { i ->
        repeat(n) { j ->
            if (board[i][j] == 'R') {
                board[i][j] = 'G'
            }
        }
    }
    val dys = getCnt()
    println("$notDys $dys")
}

fun bfs(a: Int, b: Int) {
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
            if (vis[nx][ny] || board[a][b] != board[nx][ny]) continue
            vis[nx][ny] = true
            queue.add(Pair(nx, ny))
        }
    }
}

fun getCnt(): Int {
    var cnt = 0
    repeat(n) { i ->
        repeat(n) { j ->
            if (!vis[i][j]) {
                cnt++
                bfs(i, j)
            }
        }
    }
    return cnt
}