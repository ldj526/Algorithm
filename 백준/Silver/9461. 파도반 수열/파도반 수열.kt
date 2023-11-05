fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val t = readLine().toInt()
    val dp = LongArray(100)
    dp[0] = 1
    dp[1] = 1
    dp[2] = 1
    dp[3] = 2
    dp[4] = 2
    repeat(t) {
        val n = readLine().toInt()
        for (i in 5 until n) {
            dp[i] = dp[i - 1] + dp[i - 5]
        }
        sb.append("${dp[n- 1]}\n")
    }
    print(sb)
}