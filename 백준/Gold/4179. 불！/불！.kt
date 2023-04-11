import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

lateinit var distJ: Array<IntArray>
lateinit var distF: Array<IntArray>
lateinit var board: Array<String>
val dx = intArrayOf(1, 0, 0, -1)
val dy = intArrayOf(0, 1, -1, 0)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (r, c) = readln().split(" ").map { it.toInt() }
    board = Array(r) { " " }
    distJ = Array(r) { IntArray(c) { -1 } }
    distF = Array(r) { IntArray(c) { -1 } }
    val queFire: Queue<Pair<Int, Int>> = LinkedList()
    val queJi: Queue<Pair<Int, Int>> = LinkedList()
    repeat(r) { idx ->
        board[idx] = readln()
    }
    repeat(r) { r ->
        repeat(c) { c ->
            if (board[r][c] == 'J') {
                queJi.add(Pair(r, c))
                distJ[r][c] = 0
            }
            if (board[r][c] == 'F') {
                queFire.add(Pair(r, c))
                distF[r][c] = 0
            }
        }
    }
    while (queFire.isNotEmpty()) {
        val cur: Pair<Int, Int> = queFire.first()
        queFire.poll()
        for (dir in 0 until 4) {
            val nx = cur.first + dx[dir]
            val ny = cur.second + dy[dir]
            if (nx < 0 || nx >= r || ny < 0 || ny >= c) continue
            if (distF[nx][ny] >= 0 || board[nx][ny] == '#') continue
            distF[nx][ny] = distF[cur.first][cur.second] + 1
            queFire.add(Pair(nx, ny))
        }
    }

    while (queJi.isNotEmpty()) {
        val cur: Pair<Int, Int> = queJi.first()
        queJi.poll()
        for (dir in 0 until 4) {
            val nx = cur.first + dx[dir]
            val ny = cur.second + dy[dir]
            if (nx < 0 || nx >= r || ny < 0 || ny >= c) {
                println(distJ[cur.first][cur.second] + 1)
                return
            }
            if (distJ[nx][ny] >= 0 || board[nx][ny] == '#') continue
            if (distF[nx][ny] != -1 && distF[nx][ny] <= distJ[cur.first][cur.second] + 1) continue
            distJ[nx][ny] = distJ[cur.first][cur.second] + 1
            queJi.add(Pair(nx, ny))
        }
    }
    println("IMPOSSIBLE")
}