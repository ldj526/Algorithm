fun main() {
    val sb = StringBuilder()
    val t = readln().toInt()
    repeat(t) {
        val input = getInput()
        sb.append(dpSolution(input)).append('\n')
    }
    print(sb)
}

fun getInput(): Int {
    return readln().toInt()
}

fun dpSolution(input: Int): Int {
    val dp = IntArray(12) { 0 }
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    for (i in 4..input) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
    }
    return dp[input]
}