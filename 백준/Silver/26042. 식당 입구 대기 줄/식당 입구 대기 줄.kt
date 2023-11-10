import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val qe = LinkedList<Int>()
    val info = ArrayList<Pair<Int, Int>>()
    val n = readLine().toInt()
    repeat(n) {
        val str = readLine().split(' ').map { it.toInt() }
        when (str[0]) {
            1 -> {
                qe.offer(str[1])
                info.add(Pair(qe.size, qe.peekLast()))
            }

            2 -> qe.poll()
        }
    }
    val answer = info.sortedWith(compareBy({ -it.first }, { it.second }))
    println("${answer[0].first} ${answer[0].second}")
}