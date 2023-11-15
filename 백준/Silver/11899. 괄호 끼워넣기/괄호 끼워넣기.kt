import java.util.Stack

fun main() = with(System.`in`.bufferedReader()) {
    val bracket = readLine()
    val stack = Stack<Char>()
    var cnt = 0
    for (i in bracket.indices) {
        if (stack.isEmpty() && bracket[i] == '(') {
            stack.push(bracket[i])
        } else if (stack.isEmpty() && bracket[i] == ')') {
            cnt++
        } else if (stack.isNotEmpty() && bracket[i] == ')' && stack.peek() == '(') {
            stack.pop()
        } else if (stack.isNotEmpty() && bracket[i] == '(') {
            stack.push(bracket[i])
        }
    }
    cnt += stack.size
    println(cnt)
}