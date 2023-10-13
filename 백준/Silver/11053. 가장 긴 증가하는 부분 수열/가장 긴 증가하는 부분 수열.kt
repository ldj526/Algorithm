import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val dp = IntArray(n)
    val arr = StringTokenizer(br.readLine()).run { IntArray(n) { nextToken().toInt() } }

    for (i in 0 until n) {
        dp[i] = 1
        for (j in 0 until i) {
            if (arr[j] < arr[i] && dp[i] < dp[j] + 1) {
                dp[i] = dp[j] + 1
            }
        }
    }

    var max = -1
    for (i in 0 until n) {
        max = if (dp[i] > max) dp[i] else max
    }
    print(max)
    br.close()
}