lateinit var arr: List<Int>
var cnt = 0

fun main() {
    val (n, s) = readln().split(" ").map { it.toInt() }
    arr = readln().split(" ").map { it.toInt() }
    backTracking(0, 0, s, n)
    if (s == 0) cnt--
    println(cnt)
}

fun backTracking(cur: Int, tot: Int, s: Int, n: Int) {
    if (cur == n) {
        if (tot == s) cnt++
        return
    }
    backTracking(cur + 1, tot, s, n)
    backTracking(cur + 1, tot + arr[cur], s, n)
}