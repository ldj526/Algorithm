fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    var cnt = 0
    while (n > 0) {
        if (n % 5 == 0) {
            cnt += n / 5
            break
        } else {
            n -= 2
            cnt++
        }
    }
    print(if (n >= 0) cnt else -1)
}