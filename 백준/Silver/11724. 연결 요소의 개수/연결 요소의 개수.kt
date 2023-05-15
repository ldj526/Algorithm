import java.util.*

fun main() {
    val vis = BooleanArray(1002)
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { mutableListOf<Int>() }
    repeat(m) {
        val num = readln().split(" ").map { it.toInt() }
        graph[num[0]].add(num[1])
        graph[num[1]].add(num[0])
    }
    var num = 0
    for (i in 1..n) {
        if (vis[i]) continue
        num++
        val q: Queue<Int> = LinkedList()
        q.add(i)
        vis[i] = true
        while (q.isNotEmpty()) {
            val cur = q.peek()
            q.poll()
            graph[cur].forEach {
                if (!vis[it]) {
                    q.add(it)
                    vis[it] = true
                }
            }
        }
    }
    println(num)
}