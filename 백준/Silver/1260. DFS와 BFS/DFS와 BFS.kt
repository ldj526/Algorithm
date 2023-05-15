import java.util.*

lateinit var graph: Array<MutableList<Int>>
lateinit var vis: BooleanArray
val sb = StringBuilder()

fun main() {
    val (n, m, v) = readln().split(" ").map { it.toInt() }
    graph = Array(n + 1) { mutableListOf() }
    vis = BooleanArray(n + 1) { false }
    repeat(m) {
        val num = readln().split(" ").map { it.toInt() }
        graph[num[0]].add(num[1])
        graph[num[1]].add(num[0])
    }
    for (i in 1 .. n){
        graph[i].sort()
    }
    println(dfs(v))
    vis = BooleanArray(n + 1) { false }
    print(bfs(v))
}

fun dfs(v: Int): StringBuilder {
    vis[v] = true
    sb.append(v).append(' ')
    graph[v].forEach {
        if (!vis[it]) dfs(it)
    }
    return sb
}

fun bfs(v: Int): StringBuilder {
    val sb = StringBuilder()
    val q: Queue<Int> = LinkedList()
    q.add(v)
    vis[v] = true
    while (q.isNotEmpty()) {
        val cur = q.peek()
        sb.append(cur).append(' ')
        q.poll()
        graph[cur].forEach {
            if (!vis[it]) {
                q.add(it)
                vis[it] = true
            }
        }
    }
    return sb
}