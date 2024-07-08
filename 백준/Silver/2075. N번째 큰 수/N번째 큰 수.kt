import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    val pq = PriorityQueue<Int>()

    for (i in 0 until n) {
        val row = readln().split(' ').map { it.toInt() }
        for (num in row) {
            pq.offer(num)
            if (pq.size > n) pq.poll()
        }
    }
    println(pq.poll())
}