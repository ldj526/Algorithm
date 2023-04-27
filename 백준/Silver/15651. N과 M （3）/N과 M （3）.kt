lateinit var arr: IntArray
val sb = StringBuilder()
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    arr = IntArray(m)
    backTracking(0, n, m)
    println(sb)
}

fun backTracking(k: Int, n: Int, m: Int) {
    if (k == m) {
        arr.forEach {
            sb.append(it).append(' ')
        }
        sb.append('\n')
        return
    }
    for (i in 1..n) {
        arr[k] = i
        backTracking(k + 1, n, m)
    }
}