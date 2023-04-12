import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

lateinit var vis: Array<BooleanArray>
lateinit var board: Array<IntArray>
val dx = arrayOf(1, 0, -1, 0)
val dy = arrayOf(0, 1, 0, -1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val t = readln().toInt()
    repeat(t) {
        val (m, n, k) = readln().split(" ").map { it.toInt() }
        vis = Array(n) { BooleanArray(m) }
        board = Array(n) { IntArray(m) }
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        repeat(k) {
            val (a, b) = readln().split(" ").map { it.toInt() }
            board[b][a] = 1
        }

        var cnt = 0
        repeat(n) { col ->
            repeat(m) { row ->
                if (board[col][row] == 1 && !vis[col][row]) {
                    vis[col][row] = true
                    queue.add(Pair(col, row))
                    while (queue.isNotEmpty()) {
                        val cur = queue.first()
                        queue.poll()
                        for (dir in 0 until 4) {
                            val nx = cur.first + dx[dir]
                            val ny = cur.second + dy[dir]
                            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
                            if (board[nx][ny] != 1 || vis[nx][ny]) continue
                            vis[nx][ny] = true
                            queue.add(Pair(nx, ny))
                        }
                    }
                    cnt++
                }
            }
        }
        println(cnt)
    }

}