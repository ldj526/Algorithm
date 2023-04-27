lateinit var issued1: BooleanArray
lateinit var issued2: BooleanArray
lateinit var issued3: BooleanArray
var cnt = 0

fun main() {
    val n = readln().toInt()
    issued1 = BooleanArray(2 * n)
    issued2 = BooleanArray(2 * n)
    issued3 = BooleanArray(2 * n)
    backTracking(0, n)
    println(cnt)
}

fun backTracking(cur: Int, n: Int) {
    if (cur == n) {
        cnt++
        return
    }

    for (i in 0 until n) {
        if (issued1[i] || issued2[i + cur] || issued3[cur - i + n - 1]) continue
        issued1[i] = true
        issued2[i + cur] = true
        issued3[cur - i + n - 1] = true
        backTracking(cur + 1, n)
        issued1[i] = false
        issued2[i + cur] = false
        issued3[cur - i + n - 1] = false
    }
}