lateinit var arr: IntArray
lateinit var isUsed: BooleanArray
lateinit var num: IntArray
val sb = StringBuilder()
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    arr = readln().split(" ").map { it.toInt() }.toIntArray()
    arr.sort()
    num = IntArray(2 * n)
    isUsed = BooleanArray(2 * n)
    backTracking(0, n, m)
    println(sb.toString())
}

fun backTracking(k: Int, n: Int, m: Int) {
    if (k == m) {
        for (i in 0 until m) {
            sb.append(num[i]).append(' ')
        }
        sb.append('\n')
        return
    }
    for (i in 0 until n) {
        if (!isUsed[i]) {
            num[k] = arr[i]
            isUsed[i] = true
            backTracking(k + 1, n, m)
            isUsed[i] = false
        }
    }
}