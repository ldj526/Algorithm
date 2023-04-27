lateinit var isUsed: BooleanArray
lateinit var arr: IntArray

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    isUsed = BooleanArray(2 * n)
    arr = IntArray(2 * n)
    backTracking(0, n, m)
}

fun backTracking(k: Int, n: Int, m: Int) {
    if (k == m) {
        for (i in 0 until m) {
            print("${arr[i]} ")
        }
        println()
        return
    }
    var st = 1
    if (k != 0) st = arr[k - 1] + 1
    for (i in st..n) {
        arr[k] = i
        isUsed[i] = true
        backTracking(k + 1, n, m)
        isUsed[i] = false
    }
}