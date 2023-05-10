import java.lang.Integer.min

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val list = ArrayList<Int>()
    for (i in 0 until n) {
        list.add(readln().toInt())
    }
    list.sort()
    var en = 0
    var min = 0x7fffffff
    for (st in 0 until n) {
        while (en < n && list[en] - list[st] < m) en++
        if (en == n) break
        min = min(min, list[en] - list[st])
    }
    println(min)
}