import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val qe: Queue<Int> = LinkedList()
    for (i in 1..n) {
        qe.add(i)
    }
    while (qe.size > 1) {
        if (qe.size < k) {
            val first = qe.poll()
            qe.clear()
            qe.add(first)
        } else {
            val first = qe.poll()
            repeat(k - 1) {
                qe.poll()
            }
            qe.add(first)
        }
    }
    print(qe.peek())
}