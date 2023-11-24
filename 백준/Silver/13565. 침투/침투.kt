import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val dx = intArrayOf(1, 0, 0, -1)
    val dy = intArrayOf(0, -1, 1, 0)
    val fiber = Array(N) { "" }
    val visited = Array(N) { BooleanArray(M) { false } }
    val qe: Queue<Pair<Int, Int>> = LinkedList()
    for (i in 0 until N) {
        fiber[i] = readLine()
    }
    for (i in 0 until M) {
        if (fiber[0][i] == '0') {
            qe.offer(Pair(0, i))
        }
    }
    while (qe.isNotEmpty()) {
        val cur = qe.poll()
        for (nxt in 0 until 4) {
            val nx = cur.first + dx[nxt]
            val ny = cur.second + dy[nxt]
            if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue
            if (visited[nx][ny] || fiber[nx][ny] == '1') continue
            qe.offer(Pair(nx, ny))
            visited[nx][ny] = true
        }
    }
    for (i in 0 until M) {
        if (visited[N - 1][i]) {
            print("YES")
            return@with
        }
    }
    print("NO")
}