lateinit var arr: IntArray
lateinit var issued: BooleanArray

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    arr = IntArray(n + 1)
    issued = BooleanArray(n + 1)
    backTracking(0, n, m)
}

fun backTracking(k: Int, n: Int, m: Int) {
    if (k == m) {
        for (i in 0 until m){
            print("${arr[i]} ")
        }
        println()
        return
    }

    for (i in 1..n) {
        if (!issued[i]) {
            arr[k] = i
            issued[i] = true
            backTracking(k + 1, n, m)
            issued[i] = false
        }
    }
}