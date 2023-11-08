import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val st = Stack<Homework>()
    var total = 0
    repeat(n) {
        val input = readLine().split(' ').map { it.toInt() }
        when (input[0]) {
            0 -> {
                if (st.isNotEmpty()) {
                    st.peek().remain--
                    if (st.peek().remain == 0) {
                        total += st.peek().score
                        st.pop()
                    }
                }
            }

            1 -> {
                st.push(Homework(input[1], input[2] - 1))
                if (st.peek().remain == 0) {
                    total += st.peek().score
                    st.pop()
                }
            }
        }
    }
    print(total)
}

data class Homework(val score: Int, var remain: Int)