import java.util.*

val visit = BooleanArray(101)

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val (a, b) = readLine().split(' ').map { it.toInt() }
    val m = readLine().toInt()
    val board = Array(n + 1) { ArrayList<Int>() }
    repeat(m) {
        val (x, y) = readLine().split(' ').map { it.toInt() }
        board[x].add(y)
        board[y].add(x)
    }
    println(bfs(a, b, board))
}

fun bfs(x: Int, y: Int, board: Array<ArrayList<Int>>): Int {
    val qe: Queue<Pair<Int, Int>> = LinkedList()
    visit[x] = true
    qe.add(Pair(x, 0))

    while (qe.isNotEmpty()) {
        val cur = qe.poll()
        for (nxt in board[cur.first]) {
            if (visit[nxt]) continue
            if (nxt == y) return cur.second + 1
            visit[nxt] = true
            qe.add(Pair(nxt, cur.second + 1))
        }
    }
    return -1
}
