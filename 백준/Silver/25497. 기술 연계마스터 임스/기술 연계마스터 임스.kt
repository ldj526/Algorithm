import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val N = readLine().toInt()
    val skill = readLine()
    val LR = Stack<Char>()
    val SK = Stack<Char>()
    var cnt = 0
    for (s in skill) {
        when (s) {
            'S' -> SK.push(s)
            'K' -> if (SK.isNotEmpty()) {
                SK.pop()
                cnt++
            } else break

            'L' -> LR.push(s)
            'R' -> if (LR.isNotEmpty()) {
                LR.pop()
                cnt++
            } else break

            else -> cnt++
        }
    }
    println(cnt)
}