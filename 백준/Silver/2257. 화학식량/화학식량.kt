import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val form = readLine()
    val st = Stack<Int>()
    for (i in form.indices) {
        val ch = form[i]
        when (ch) {
            ')' -> {
                var sum = 0
                while (true) {
                    if (st.peek() == -1) {
                        st.pop()
                        st.push(sum)
                        break
                    }
                    sum += st.pop()
                }
            }

            'C' -> {
                st.push(12)
            }

            'H' -> {
                st.push(1)
            }

            'O' -> {
                st.push(16)
            }

            '(' -> {
                st.push(-1)
            }

            else -> {
                st.push(st.pop() * (ch - '0'))
            }
        }
    }
    var result = 0
    while(st.isNotEmpty()) result += st.pop()
    print(result)
}