import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

lateinit var dist: IntArray

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, k) = readln().split(" ").map { it.toInt() }
    dist = IntArray(100001) { -1 }
    dist[n] = 0
    val que: Queue<Int> = LinkedList()
    que.add(n)
    while (dist[k] == -1) {
        val cur = que.first()
        que.poll()
        if (cur - 1 >= 0 && dist[cur - 1] == -1) {
            que.add(cur - 1)
            dist[cur - 1] = dist[cur] + 1
        }
        if (cur + 1 < dist.size && dist[cur + 1] == -1) {
            que.add(cur + 1)
            dist[cur + 1] = dist[cur] + 1
        }
        if (cur * 2 < dist.size && dist[cur * 2] == -1) {
            que.add(cur * 2)
            dist[cur * 2] = dist[cur] + 1
        }
    }
    println(dist[k])
}