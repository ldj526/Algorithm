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
                }
            }

            1 -> {
                st.push(Homework(input[1], input[2] - 1))
            }

        }
        if (st.isNotEmpty() && st.peek().remain == 0) {
            total += st.pop().score
        }
    }
    print(total)
}

data class Homework(val score: Int, var remain: Int)