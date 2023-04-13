import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

lateinit var vis: Array<BooleanArray>
lateinit var board: Array<IntArray>
val dx = arrayOf(1, -1, 0, 0)
val dy = arrayOf(0, 0, 1, -1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (m, n, k) = readln().split(" ").map { it.toInt() }
    vis = Array(m) { BooleanArray(n) }
    board = Array(m) { IntArray(n) }
    repeat(k) {
        val (a, b, c, d) = readln().split(" ").map { it.toInt() }
        fillArea(a, b, c, d)
    }

    val list = ArrayList<Int>()
    var cnt = 0
    for (i in 0 until m) {
        for (j in 0 until n) {
            if (board[i][j] == 1 || vis[i][j]) continue
            var area = 1
            val queue: Queue<Pair<Int, Int>> = LinkedList()
            queue.add(Pair(i, j))
            vis[i][j] = true
            while (queue.isNotEmpty()) {
                val cur = queue.first()
                queue.poll()
                for (dir in 0 until 4) {
                    val nx = cur.first + dx[dir]
                    val ny = cur.second + dy[dir]
                    if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue
                    if (board[nx][ny] == 1 || vis[nx][ny]) continue
                    vis[nx][ny] = true
                    queue.add(Pair(nx, ny))
                    area++
                }
            }
            list.add(area)
            cnt++
        }
    }
    list.sort()
    println(cnt)
    for (i in 0 until list.size) {
        print("${list[i]} ")
    }
}

fun fillArea(a: Int, b: Int, c: Int, d: Int) {
    for (i in b until d) {
        for (j in a until c) {
            board[i][j] = 1
            vis[i][j] = true
        }
    }
}