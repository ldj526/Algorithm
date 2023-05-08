fun main() {
    val n = readln().toInt()
    val dp = IntArray(1_000_002)
    val pre = IntArray(1_000_002)
    dp[1] = 0
    for (i in 2..n) {
        dp[i] = dp[i - 1] + 1
        pre[i] = i - 1

        if (i % 2 == 0 && dp[i] > dp[i / 2] + 1) {
            dp[i] = dp[i / 2] + 1
            pre[i] = i / 2
        }
        if (i % 3 == 0 && dp[i] > dp[i / 3] + 1) {
            dp[i] = dp[i / 3] + 1
            pre[i] = i / 3
        }
    }
    println(dp[n])
    var cur = n
    while (true) {
        print("$cur ")
        if (cur == 1) break
        cur = pre[cur]
    }
}