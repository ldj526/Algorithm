import java.util.*

fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()
    val stack = Stack<Int>()
    repeat(n) {
        val input = readln()
        when (input[0]) {
            '1' -> {
                stack.push(input.substring(2).toInt())
            }
            '2' -> {
                if (stack.isNotEmpty()) {
                    sb.append(stack.peek()).append('\n')
                    stack.pop()
                } else {
                    sb.append(-1).append('\n')
                }
            }
            '3' -> {
                sb.append(stack.size).append('\n')
            }
            '4' -> {
                if (stack.isNotEmpty()) {
                    sb.append(0).append('\n')
                } else {
                    sb.append(1).append('\n')
                }
            }
            '5' -> {
                if (stack.isNotEmpty()) {
                    sb.append(stack.peek()).append('\n')
                } else {
                    sb.append(-1).append('\n')
                }
            }
        }
    }
    print(sb)
}