import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

lateinit var dist: Array<IntArray>
var n: Int = 0
val dx = arrayOf(1, 1, 2, 2, -1, -1, -2, -2)
val dy = arrayOf(2, -2, 1, -1, 2, -2, 1, -1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val l = readln().toInt()
    repeat(l) {
        n = readln().toInt()
        dist = Array(n) { IntArray(n) { -1 } }
        val (a, b) = readln().split(" ").map { it.toInt() }
        println(bfs(a, b))
    }
}

fun bfs(a: Int, b: Int): Int {
    val (c, d) = readln().split(" ").map { it.toInt() }
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(Pair(a, b))
    dist[a][b] = 0
    while (queue.isNotEmpty()) {
        val cur = queue.first()
        queue.poll()
        for (dir in 0 until 8) {
            val nx = cur.first + dx[dir]
            val ny = cur.second + dy[dir]
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue
            if (dist[nx][ny] >= 0) continue
            dist[nx][ny] = dist[cur.first][cur.second] + 1
            queue.add(Pair(nx, ny))
        }
    }
    return dist[c][d]
}