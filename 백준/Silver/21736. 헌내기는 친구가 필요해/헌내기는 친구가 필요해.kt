import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val dx = intArrayOf(1, 0, 0, -1)
    val dy = intArrayOf(0, -1, 1, 0)
    val campus = Array(N) { "" }
    val visited = Array(N) { BooleanArray(M) { false } }
    val qe: Queue<Pair<Int, Int>> = LinkedList()
    for (i in 0 until N) {
        campus[i] = readLine()
    }
    for (i in 0 until N) {
        for (j in 0 until M) {
            if (campus[i][j] == 'I') {
                qe.offer(Pair(i, j))
            }
        }
    }
    var cnt = 0
    while (qe.isNotEmpty()) {
        val cur = qe.poll()
        for (nxt in 0 until 4) {
            val nx = cur.first + dx[nxt]
            val ny = cur.second + dy[nxt]
            if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue
            if (visited[nx][ny] || campus[nx][ny] == 'X') continue
            if (campus[nx][ny] == 'P') cnt++
            visited[nx][ny] = true
            qe.offer(Pair(nx, ny))
        }
    }
    if (cnt == 0) print("TT")
    else print(cnt)
}