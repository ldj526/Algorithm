fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val M = readLine().toInt()
    val locates = readLine().split(' ').map { it.toInt() }
    var answer = 0
    var st = 1
    var en = N
    while (st <= en) {
        val mid = (st + en) / 2
        var flag = true
        var point = 0
        for (locate in locates) {
            if (locate - mid <= point) {
                point = locate + mid
            }
        }
        flag = N - point <= 0
        if (flag) {
            answer = mid
            en = mid - 1
        } else st = mid + 1
    }
    print(answer)
}