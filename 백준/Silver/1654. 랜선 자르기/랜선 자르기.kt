fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(' ').map { it.toInt() }
    val cable = IntArray(n) { br.readLine().toInt() }
    cable.sort()

    var max = cable[n - 1].toLong()
    var min = 1L
    var mid: Long
    while (min <= max) {
        var cnt = 0L
        mid = (max + min) / 2
        cable.forEach {
            cnt += it / mid
        }
        if (cnt < m) {
            max = mid - 1
        } else {
            min = mid + 1
        }
    }
    print(max)
    br.close()
}