import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val len = StringTokenizer(br.readLine()).run { LongArray(n - 1) { nextToken().toLong() } }
    val gas = StringTokenizer(br.readLine()).run { LongArray(n) { nextToken().toLong() } }
    var sum = 0L
    var minCost = gas[0]

    for (i in 0 until n - 1) {
        if (gas[i] < minCost) {
            minCost = gas[i]
        }
        sum += minCost * len[i]
    }
    print(sum)
    br.close()
}