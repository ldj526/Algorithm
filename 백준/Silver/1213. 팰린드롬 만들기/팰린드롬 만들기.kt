fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val alpha = IntArray(26)
    val str = readLine()
    for (element in str) {
        alpha[element - 'A']++
    }
    var odd = 0
    for (element in alpha) {
        if (element % 2 != 0) odd++
    }
    if (odd > 1) {
        print("I'm Sorry Hansoo")
        return@with
    } else {
        var cnt = 0
        for (i in alpha.indices) {
            cnt = alpha[i] / 2
            repeat(cnt) {
                sb.append((i + 65).toChar())
            }
        }
        val reverse = sb.reversed()
        for (i in alpha.indices) {
            if (alpha[i] % 2 == 1) sb.append((i + 65).toChar())
        }
        sb.append(reverse)
    }
    println(sb)
}