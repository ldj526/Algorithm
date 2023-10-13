fun main() {
    val br = System.`in`.bufferedReader()
    val S = br.readLine().toLong()
    var n = 1L
    var sum = 1L

    while (sum + n + 1 <= S) {
        n++
        sum += n
    }
    print(n)
    br.close()
}