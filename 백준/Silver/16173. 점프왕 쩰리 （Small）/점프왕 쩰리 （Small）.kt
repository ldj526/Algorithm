import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    val map = Array(n) { IntArray(n) }

    for (i in 0 until n) {
        val row = readln().split(' ').map { it.toInt() }
        for (j in 0 until n) {
            map[i][j] = row[j]
        }
    }

    val visited = Array(n) { BooleanArray(n) }
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(Pair(0, 0))
    visited[0][0] = true

    val dx = intArrayOf(1, 0)
    val dy = intArrayOf(0, 1)

    while (queue.isNotEmpty()) {
        val cur: Pair<Int, Int> = queue.poll()
        val temp = map[cur.first][cur.second]
        if (temp == -1) {
            println("HaruHaru")
            return@with
        }
        for (dir in 0 until 2) {
            val nx = cur.first + dx[dir] * temp
            val ny = cur.second + dy[dir] * temp
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue
            if (visited[nx][ny]) continue
            visited[nx][ny] = true
            queue.add(Pair(nx, ny))
        }
    }
    println("Hing")
}