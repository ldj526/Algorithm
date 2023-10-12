import java.util.*

fun main() {
    val (n, p) = readln().split(' ').map { it.toInt() }
    val st = Array(7) { Stack<Int>() }
    for (i in 1..6) {
        st[i] = Stack<Int>()
    }
    var cnt = 0
    repeat(n) {
        val (pitch, flat) = readln().split(' ').map { it.toInt() }
        while (st[pitch].isNotEmpty()) {
            if (st[pitch].last() < flat) {
                st[pitch].push(flat)
            } else if (st[pitch].last() > flat) {
                st[pitch].pop()
            } else break
            cnt++
        }
        if (st[pitch].isEmpty()) {
            st[pitch].push(flat)
            cnt++
        }
    }
    print(cnt)
}