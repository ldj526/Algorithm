fun main() = with(System.`in`.bufferedReader()) {
    val (x, y) = readLine().split(' ').map { it.toLong() }
    var z = 100 * y / x
    var right = x
    var left = 0L
    if (z >= 99) {
        println(-1)
        return@with
    }
    while (right >= left) {
        var mid = (right + left) / 2
        val result = 100 * (mid + y) / (mid + x)
        if (result != z) right = mid - 1
        else left = mid + 1
    }
    println(left)
}