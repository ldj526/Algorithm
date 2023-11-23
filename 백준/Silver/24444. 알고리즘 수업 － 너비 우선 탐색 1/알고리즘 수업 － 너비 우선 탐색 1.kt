import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val (N, M, R) = readLine().split(' ').map { it.toInt() }
    val graph = Array(N + 1) { ArrayList<Int>() }
    val visited = IntArray(N + 1) { 0 }
    repeat(M) {
        val (u, v) = readLine().split(' ').map { it.toInt() }
        graph[u].add(v)
        graph[v].add(u)
    }

    graph.forEach {
        it.sort()
    }
    var cnt = 1
    val qe: Queue<Int> = LinkedList()
    visited[R] = cnt++
    qe.offer(R)
    while (qe.isNotEmpty()) {
        val cur = qe.poll()
        for (nxt in graph[cur]) {
            if (visited[nxt] != 0) continue
            qe.offer(nxt)
            visited[nxt] = cnt++
        }
    }
    for (i in 1..N){
        println(visited[i])
    }
}