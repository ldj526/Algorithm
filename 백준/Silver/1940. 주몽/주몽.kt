fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val m = readLine().toInt()
    val arr = readLine().split(' ').map { it.toInt() }.sorted()
    var cnt = 0
    var st = 0
    var en = arr.size - 1
    while (st < en) {
        if (arr[st] + arr[en] == m) {
            st++
            en--
            cnt++
        } else {
            if (arr[st] + arr[en] > m) {
                en--
            } else {
                st++
            }
        }
    }
    print(cnt)
}