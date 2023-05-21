import java.util.*

fun main() {
    val sb = StringBuilder()
    val (n, m) = readln().split(" ").map { it.toInt() }
    val degree = Array(32002) { 0 }
    val list = Array<ArrayList<Int>>(100_000) { ArrayList() }
    repeat(m) {
        val num = readln().split(" ").map { it.toInt() }
        list[num[0]].add(num[1])
        degree[num[1]]++
    }
    val q: Queue<Int> = LinkedList()
    for (i in 1..n) {
        if (degree[i] == 0) q.add(i)
    }
    while (q.isNotEmpty()) {
        val cur = q.peek()
        q.poll()
        sb.append(cur).append(' ')
        list[cur].forEach {
            degree[it]--
            if (degree[it] == 0) q.add(it)
        }
    }
    println(sb)
}