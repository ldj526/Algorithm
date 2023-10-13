import java.util.*
import kotlin.math.pow

fun main() {
    val n = readln().toInt()
    val qe: Queue<Int> = LinkedList()
    var cnt = 1.0
    for (i in 1..n) qe.offer(i)
    repeat(n - 1) {
        val a = cnt.pow(3.0).toLong() - 1
        val mod = a % qe.size
        repeat(mod.toInt()) {
            qe.offer(qe.poll())
        }
        qe.poll()
        cnt++
    }
    print(qe.peek())
}