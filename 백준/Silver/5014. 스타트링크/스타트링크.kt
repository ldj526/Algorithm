import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

lateinit var dist: IntArray

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (F, S, G, U, D) = readln().split(" ").map { it.toInt() }
    dist = IntArray(F + 1) { -1 }

    val queue: Queue<Int> = LinkedList()
    queue.add(S)
    dist[S] = 0
    while (queue.isNotEmpty()) {
        val cur = queue.first()
        queue.poll()
        val nu = cur + U
        val nd = cur - D
        if (nu <= F && dist[nu] == -1) {
            dist[nu] = dist[cur] + 1
            queue.add(nu)
        }
        if (nd > 0 && dist[nd] == -1) {
            dist[nd] = dist[cur] + 1
            queue.add(nd)
        }
    }
    if (dist[G] == -1) {
        println("use the stairs")
    } else {
        println(dist[G])
    }
}