import kotlin.math.min

fun main() {
    val n = readln().toInt()
    val arr = IntArray(305)
    val dp = IntArray(305)
    var sum = 0
    for (i in 1..n) {
        arr[i] = readln().toInt()
        sum += arr[i]
    }
    if (n <= 2) {
        println(sum)
        return
    }
    dp[1] = arr[1]
    dp[2] = arr[2]
    dp[3] = arr[3]
    for (i in 4 until n) {
        dp[i] = min(dp[i - 3], dp[i - 2]) + arr[i]
    }
    println(sum - min(dp[n - 1], dp[n - 2]))
}