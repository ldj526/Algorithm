import java.lang.Integer.max

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val number = readLine().split(' ').map { it.toInt() }
    val dp = IntArray(n)
    dp[0] = number[0]
    var max = number[0]
    for (i in 1 until n) {
        dp[i] = max(dp[i - 1] + number[i], number[i])
        max = max(max, dp[i])
    }
    print(max)
}