import java.util.*

fun main() {
    val n = readln().toInt()
    val stu = StringTokenizer(readln()).run { IntArray(n) { nextToken().toInt() } }
    val st = Stack<Int>()
    var cur = 1
    for (i in stu) {
        if (i == cur) {
            cur++
            while (st.isNotEmpty() && st.last() == cur) {
                st.pop()
                cur++
            }
        } else {
            st.push(i)
        }
    }
    print(if (st.isEmpty()) "Nice" else "Sad")
}