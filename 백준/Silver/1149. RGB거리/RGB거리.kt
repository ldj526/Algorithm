import java.util.*
import kotlin.math.min

fun main() {
    val n = readln().toInt()
    val arrRed = IntArray(1002)
    val arrBlue = IntArray(1002)
    val arrGreen = IntArray(1002)
    for (i in 1..n){
        val num = readln().split(" ").map { it.toInt() }
        arrRed[i] = num[0]
        arrBlue[i] = num[1]
        arrGreen[i] = num[2]
    }
    val dp = Array(1002) { IntArray(3) }
    dp[1][0] = arrRed[1]
    dp[1][1] = arrGreen[1]
    dp[1][2] = arrBlue[1]
    for (i in 2..n) {
        dp[i][0] = min(dp[i - 1][1], dp[i - 1][2]) + arrRed[i]
        dp[i][1] = min(dp[i - 1][0], dp[i - 1][2]) + arrGreen[i]
        dp[i][2] = min(dp[i - 1][0], dp[i - 1][1]) + arrBlue[i]
    }
    println(dp[n].minBy { it })
}