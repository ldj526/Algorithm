import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

lateinit var vis: Array<BooleanArray>
lateinit var board: Array<CharArray>
val dx = arrayOf(1, -1, 0, 0)
val dy = arrayOf(0, 0, 1, -1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readln().toInt()
    vis = Array(n) { BooleanArray(n) }
    board = Array(n) { CharArray(n) }
    repeat(n) { i ->
        val str = readln()
        repeat(n) { j ->
            board[i][j] = str[j]
        }
    }

    val list = ArrayList<Int>()
    var cnt = 0
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (board[i][j] == '0' || vis[i][j]) continue
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
                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue
                    if (board[nx][ny] == '0' || vis[nx][ny]) continue
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
        println("${list[i]} ")
    }
}