import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val k = readLine().toInt()
    val stack = Stack<Int>()
    repeat(k) {
        val num = readLine().toInt()
        when (num) {
            0 -> {
                if (stack.isNotEmpty()) {
                    stack.pop()
                }
            }

            else -> {
                stack.push(num)
            }
        }
    }
    var sum = 0
    for (i in 0 until stack.size) {
        sum += stack[i]
    }
    println(sum)
}