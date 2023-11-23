import java.util.*

var visit = Array(52) { BooleanArray(52) }
var board = Array(52) { IntArray(52) }
val dx = intArrayOf(-1, -1, -1, 0, 0, 1, 1, 1)
val dy = intArrayOf(0, 1, -1, 1, -1, 0, -1, 1)
var cnt = 0
var x = 0
var y = 0
fun main() = with(System.`in`.bufferedReader()) {
    while (true) {
        cnt = 0
        StringTokenizer(readLine()).let {
            x = it.nextToken().toInt()
            y = it.nextToken().toInt()
        }
        if (x == 0 && y == 0) break
        board = Array(y) { IntArray(x) }
        visit = Array(y) { BooleanArray(x) }
        for (i in 0 until y) {
            val st = StringTokenizer(readLine())
            for (j in 0 until x) {
                val a = st.nextToken().toInt()
                board[i][j] = a
            }
        }
        for (i in 0 until y) {
            for (j in 0 until x) {
                if (!visit[i][j] && board[i][j] == 1) {
                    bfs(i, j)
                }
            }
        }
        println(cnt)
    }
}

fun bfs(a: Int, b: Int) {
    val qe: Queue<Pair<Int, Int>> = LinkedList()
    qe.offer(Pair(a, b))
    visit[a][b] = true
    while (qe.isNotEmpty()) {
        val cur = qe.poll()
        for (nxt in 0 until 8) {
            val nx = cur.first + dx[nxt]
            val ny = cur.second + dy[nxt]
            if (nx < 0 || ny < 0 || nx >= y || ny >= x) continue
            if (visit[nx][ny] || board[nx][ny] == 0) continue
            visit[nx][ny] = true
            qe.offer(Pair(nx, ny))
        }
    }
    cnt++
}