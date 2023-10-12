import java.util.*

fun main() {
    val sb = StringBuilder()
    var tc = 1
    while (true) {
        val stack = Stack<Char>()
        var cnt = 0
        val input = readln()
        if (input.contains("-")) break
        for (i in input.indices) {
            if (input[i] == '{') stack.push(input[i])
            else {
                if (stack.isEmpty()) {
                    cnt++
                    stack.push('{')
                } else {
                    stack.pop()
                }
            }
        }
        cnt += (stack.size / 2)
        sb.append(tc).append(". ").append(cnt).append('\n')
        tc++
    }
    print(sb)
}