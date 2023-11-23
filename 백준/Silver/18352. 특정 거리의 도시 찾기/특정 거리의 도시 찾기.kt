import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val (n, m, k, x) = readLine().split(' ').map { it.toInt() }
    val board = Array(n + 1) { ArrayList<Int>() }
    val visit = Array(n + 1) { -1 }
    repeat(m) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        board[a].add(b)
    }

    val qe: Queue<Int> = LinkedList()
    qe.offer(x)
    visit[x] = 0

    while (qe.isNotEmpty()) {
        val cur = qe.poll()
        for (nxt in board[cur]) {
            if (visit[nxt] == -1) {
                qe.offer(nxt)
                visit[nxt] = visit[cur] + 1
            }
        }
    }
    for (i in 1..n) {
        if (visit[i] == k) sb.append(i).append('\n')
    }
    if (sb.isNotEmpty()) print(sb)
    else print(-1)
}