fun main() {
    val sb = StringBuilder()
    val (n, m) = readln().split(" ").map { it.toInt() }
    val numList = readln().split(" ").map { it.toInt() }
    val dp = IntArray(100_002)
    dp[0] = 0
    for (i in 1..n) {
        dp[i] = dp[i - 1] + numList[i - 1]

    }
    for (i in 0 until m) {
        val num = readln().split(" ").map { it.toInt() }
        sb.append(dp[num[1]] - dp[num[0] - 1]).append('\n')
    }
    println(sb)
}