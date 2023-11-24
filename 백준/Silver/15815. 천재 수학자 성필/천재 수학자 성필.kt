import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val expression = readLine()
    val st = Stack<Int>()
    for (i in expression.indices) {
        if (expression[i] >= '0') {
            st.push(expression[i] - '0')
        } else {
            val num1 = st.pop()
            val num2 = st.pop()
            when (expression[i]) {
                '+' -> st.push(num1 + num2)
                '-' -> st.push(num2 - num1)
                '*' -> st.push(num1 * num2)
                '/' -> st.push(num2 / num1)
            }
        }
    }
    print(st.peek())
}