import java.util.*

fun main() {
    val sb = StringBuilder()
    val n = readln().toInt()
    val a = StringTokenizer(readln()).run { IntArray(n) { nextToken().toInt() } }
    val b = StringTokenizer(readln()).run { IntArray(n) { nextToken().toInt() } }
    val qe: Queue<Int> = LinkedList()
    for (i in n - 1 downTo 0) {
        if (a[i] == 0) qe.offer(b[i])
    }
    val m = readln().toInt()
    val st = StringTokenizer(readln())
    repeat(m) {
        val c = st.nextToken().toInt()
        qe.offer(c)
        sb.append(qe.poll()).append(' ')
    }
    println(sb)
}