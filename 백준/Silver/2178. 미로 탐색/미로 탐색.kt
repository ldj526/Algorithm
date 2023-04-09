import java.util.*

val dx = arrayOf(-1, 0, 1, 0)
val dy = arrayOf(0, 1, 0, -1)
var dist: Array<Array<Int>> = Array(102) { Array(102) { -1 } }
var board = Array(102){" "}

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    for (i in 0 until n) {
        board[i] = sc.next()
    }
    val qe: Queue<Pair<Int, Int>> = LinkedList()
    qe.offer(Pair(0, 0))
    dist[0][0] = 0
    while (qe.isNotEmpty()) {
        var cur: Pair<Int, Int> = qe.peek()
        qe.poll()
        for (dir in 0 until 4) {
            val nx = cur.first + dx[dir]
            val ny = cur.second + dy[dir]
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
            if (dist[nx][ny] >= 0 || board[nx][ny] != '1') continue
            dist[nx][ny] = dist[cur.first][cur.second] + 1
            qe.add(Pair(nx, ny))
        }
    }
    println(dist[n - 1][m - 1] + 1)
}