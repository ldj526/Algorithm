fun main() {
    val br = System.`in`.bufferedReader()
    var (a, b) = br.readLine().split(' ').map { it.toInt() }
    var cnt = 1
    while (a != b) {
        if (a > b) {
            print(-1)
            return
        }
        if (b % 10 == 1) {
            b /= 10
        } else if (b % 2 == 0) {
            b /= 2
        } else {
            print(-1)
            return
        }
        cnt++
    }
    print(cnt)
    br.close()
}