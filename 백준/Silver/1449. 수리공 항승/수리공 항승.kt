fun main() = with(System.`in`.bufferedReader()) {
    val (n, l) = readLine().split(' ').map { it.toInt() }
    val leakPoint = readLine().split(' ').map { it.toInt() }.sorted()
    var cur = 0
    var cnt = 1

    for (i in 0 until n) {
        if (leakPoint[i] - leakPoint[cur] >= l) {
            cnt++
            cur = i
        }
    }
    println(cnt)
}