import java.util.*
import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val dx = intArrayOf(-1, -1, -1, 0, 0, 1, 1, 1)
    val dy = intArrayOf(1, 0, -1, 1, -1, 1, 0, -1)
    val board = Array(N) { IntArray(M) }
    val dist = Array(N) { IntArray(M) { -1 } }
    val qe: Queue<Pair<Int, Int>> = LinkedList()
    for (i in 0 until N) {
        val st = StringTokenizer(readLine())
        for (j in 0 until M) {
            board[i][j] = st.nextToken().toInt()
            if (board[i][j] == 1) {
                dist[i][j] = 0
                qe.offer(Pair(i, j))
            }
        }
    }
    while (qe.isNotEmpty()) {
        val cur = qe.poll()
        for (nxt in 0 until 8) {
            val nx = cur.first + dx[nxt]
            val ny = cur.second + dy[nxt]
            if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue
            if (dist[nx][ny] > 0 || board[nx][ny] == 1) continue
            dist[nx][ny] = dist[cur.first][cur.second] + 1
            qe.offer(Pair(nx, ny))
        }
    }
    var safeDist = -1
    for (i in 0 until N) {
        for (j in 0 until M) {
            safeDist = max(dist[i][j], safeDist)
        }
    }
    println(safeDist)
}