import java.util.LinkedList
import java.util.Queue

lateinit var adList: Array<ArrayList<Int>>
lateinit var parent: Array<Int>

fun main() {
    val n = readln().toInt()
    adList = Array(n + 1) { ArrayList() }
    parent = Array(n + 1) { 0 }
    repeat(n - 1) {
        val num = readln().split(" ").map { it.toInt() }
        adList[num[0]].add(num[1])
        adList[num[1]].add(num[0])
    }
    bfs(1)
    for (i in 2..n) {
        println(parent[i])
    }
}

fun bfs(num: Int) {
    val q: Queue<Int> = LinkedList()
    q.add(num)
    while (q.isNotEmpty()) {
        val cur = q.peek()
        q.poll()
        adList[cur].forEach {
            if(parent[cur] != it){
                parent[it] = cur
                q.add(it)
            }
        }
    }
}