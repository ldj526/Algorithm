lateinit var arr: IntArray
lateinit var num: IntArray
val sb = StringBuilder()
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    arr = readln().split(" ").map { it.toInt() }.toIntArray()
    arr.sort()
    num = IntArray(2 * n)
    backTracking(0, n, m)
    println(sb)
}

fun backTracking(k: Int, n: Int, m: Int) {
    if (k == m) {
        for (i in 0 until m) {
            sb.append(arr[num[i]]).append(' ')
        }
        sb.append('\n')
        return
    }
    var st = 0
    if (k != 0) st = num[k - 1]
    for (i in st until n) {
        num[k] = i
        backTracking(k + 1, n, m)
    }
}