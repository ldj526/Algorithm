import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

lateinit var dist: Array<Array<IntArray>>
lateinit var board: Array<Array<CharArray>>
val dx = arrayOf(1, -1, 0, 0, 0, 0)
val dy = arrayOf(0, 0, 1, -1, 0, 0)
val dz = arrayOf(0, 0, 0, 0, 1, -1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        val (c, r, l) = readln().split(" ").map { it.toInt() }
        if (c == 0 && r == 0 && l == 0) break
        dist = Array(c) { Array(r) { IntArray(l) { -1 } } }
        board = Array(c) { Array(r) { CharArray(l) } }
        val queue: Queue<Triple<Int, Int, Int>> = LinkedList()
        repeat(c) { i ->
            for (j in 0 until r + 1) {
                val str = readln()
                if (str == "") continue
                repeat(l) { k ->
                    board[i][j][k] = str[k]
                    if (board[i][j][k] == 'S') {
                        queue.add(Triple(i, j, k))
                        dist[i][j][k] = 0
                    }
                }
            }
        }
        var isEscape = false
        while (queue.isNotEmpty()) {
            val cur = queue.first()
            queue.poll()
            for (dir in 0 until 6) {
                val nx = cur.first + dx[dir]
                val ny = cur.second + dy[dir]
                val nz = cur.third + dz[dir]
                if (nx < 0 || nx >= c || ny < 0 || ny >= r || nz < 0 || nz >= l) continue
                if (board[nx][ny][nz] == '#' || dist[nx][ny][nz] >= 0) continue
                dist[nx][ny][nz] = dist[cur.first][cur.second][cur.third] + 1
                if (board[nx][ny][nz] == 'E') {
                    println("Escaped in ${dist[nx][ny][nz]} minute(s).")
                    isEscape = true
                    break
                }
                queue.add(Triple(nx, ny, nz))
            }
        }
        if (!isEscape) {
            println("Trapped!")
        }
    }
}