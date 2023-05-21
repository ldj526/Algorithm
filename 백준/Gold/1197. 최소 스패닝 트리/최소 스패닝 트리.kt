lateinit var p: IntArray
lateinit var edge: ArrayList<Triple<Int, Int, Int>>

fun main() {
    edge = ArrayList(100_002)
    p = IntArray(10_002) { -1}
    val (v, e) = readln().split(" ").map { it.toInt() }
    for (i in 0 until e) {
        val num = readln().split(" ").map { it.toInt() }
        edge.add(Triple(num[0], num[1], num[2]))
    }
    edge.sortWith(compareBy { it.third })
    var cnt = 0
    var ans = 0
    for (i in 0 until e) {
        if (union(edge[i].first, edge[i].second)) continue
        ans += edge[i].third
        cnt++
        if (cnt == v - 1) break
    }
    println(ans)
}

fun find(x: Int): Int {
    if (p[x] < 0) return x
    p[x] = find(p[x])
    return p[x]
}

fun union(x: Int, y: Int): Boolean {
    val nx = find(x)
    val ny = find(y)
    if (nx == ny) return true
    if (p[nx] > p[ny]) p[nx] = p[ny].also { p[ny] = p[nx] }
    p[nx] += p[ny]
    p[ny] = nx
    return false
}