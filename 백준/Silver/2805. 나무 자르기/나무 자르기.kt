import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(' ').map { it.toLong() }
    val tree = StringTokenizer(br.readLine()).run { LongArray(n.toInt()) { nextToken().toLong() } }
    tree.sort()
    var en = tree[n.toInt() - 1]
    var st = 0L
    var mid = (st + en) / 2
    while (st <= en) {
        var sum = 0L
        tree.forEach {
            if (it >= mid) {
                sum += it - mid
            }
        }
        if (sum >= m) {
            st = mid + 1
        } else {
            en = mid - 1
        }
        mid = (st + en) / 2
    }
    print(mid)
    br.close()
}