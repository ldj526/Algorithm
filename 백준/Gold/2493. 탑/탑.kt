import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine(), " ")
    val sb = StringBuilder()
    val stack = Stack<Pair<Int, Int>>()
    repeat(n) { idx ->
        val num = st.nextToken().toInt()
        if (stack.empty()) {
            sb.append("0 ")
            stack.push(Pair(idx, num))
        } else {
            while (true) {
                if (stack.empty()) {
                    sb.append("0 ")
                    stack.push(Pair(idx, num))
                    break
                }
                if (stack.peek().second > num) {
                    sb.append("${stack.peek().first + 1} ")
                    stack.push(Pair(idx, num))
                    break
                } else {
                    stack.pop()
                }
            }
        }
    }
    println(sb)
}
