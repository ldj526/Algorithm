import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    val votes = mutableListOf<Int>()

    repeat(n) {
        votes.add(readLine().toInt())
    }

    var dasom = votes[0]

    val pq = PriorityQueue<Int>(reverseOrder())
    for (i in 1 until n) pq.add(votes[i])

    var cnt = 0

    while (pq.isNotEmpty() && pq.peek() >= dasom) {
        val top = pq.poll()
        pq.add(top - 1)
        dasom++
        cnt++
    }
    println(cnt)
}
