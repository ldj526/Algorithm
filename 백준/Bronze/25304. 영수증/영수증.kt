import java.util.*

fun main() {
    val x = readln().toInt()
    val n = readln().toInt()
    var sum = 0
    for (i in 0 until n) {
        val st = StringTokenizer(readln())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        sum += a * b
    }
    if (sum == x) {
        print("Yes")
    } else {
        print("No")
    }
}