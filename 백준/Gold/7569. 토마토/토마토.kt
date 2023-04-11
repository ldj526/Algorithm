import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

lateinit var dist: Array<Array<IntArray>>
lateinit var board: Array<Array<IntArray>>
val dx = intArrayOf(1, 0, 0, -1, 0, 0)
val dy = intArrayOf(0, 1, -1, 0, 0, 0)
val dz = intArrayOf(0, 0, 0, 0, 1, -1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (m, n, h) = readln().split(" ").map { it.toInt() }
    dist = Array(h) { Array(n) { IntArray(m) } }
    board = Array(h) { Array(n) { IntArray(m) } }
    val queue: Queue<Triple<Int, Int, Int>> = LinkedList()
    repeat(h) { h ->
        repeat(n) { n ->
            val list = readln().split(" ").map { it.toInt() }
            list.forEachIndexed { m, num ->
                board[h][n][m] = num
                if (board[h][n][m] == 1) {
                    queue.add(Triple(h, n, m))
                }
                if (board[h][n][m] == 0) {
                    dist[h][n][m] = -1
                }
            }
        }
    }
    while (queue.isNotEmpty()) {
        val cur: Triple<Int, Int, Int> = queue.first()
        queue.poll()
        for (dir in 0 until 6) {
            val nx = cur.second + dx[dir]
            val ny = cur.third + dy[dir]
            val nz = cur.first + dz[dir]
            if (nx < 0 || nx >= n || ny < 0 || ny >= m || nz < 0 || nz >= h) continue
            if (dist[nz][nx][ny] >= 0) continue
            dist[nz][nx][ny] = dist[cur.first][cur.second][cur.third] + 1
            queue.add(Triple(nz, nx, ny))
        }
    }
    var days = 0
    repeat(h) { h ->
        repeat(n) { n ->
            repeat(m) { m ->
                if (dist[h][n][m] == -1) {
                    println("-1")
                    return
                }
                days = max(days, dist[h][n][m])
            }
        }
    }
    println(days)
}